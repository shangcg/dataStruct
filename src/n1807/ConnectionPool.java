package n1807;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * 连接池
 * @author shangcg
 *
 */
public class ConnectionPool {
	
	//双向队列维护连接池
	private LinkedList<Connection> pool = new LinkedList<Connection>();
	
	/**
	 * 初始化连接池
	 * @param inittalSize	初始化连接池大小
	 */
	public ConnectionPool(int inittalSize){
		if(inittalSize >0){
			for(int i=0; i<inittalSize; i++){
				pool.addLast(ConnectionDriver.createConnection());
			}
		}
		
		
	}
	
	/**
	 * 释放连接
	 * @param connection
	 */
	public void releaseConnection(Connection connection){
		if (connection != null) {
			synchronized (pool) {
				//连接释放后需要进行通知，这样其他消费者能够感知到连接池中已经归还一个连接
				pool.addLast(connection); //?
				pool.notifyAll();
			}
		}
	}
	
	/**
	 * 获取连接
	 * @param mills	超时时间
	 * @return
	 * @throws InterruptedException 
	 */
	public Connection fetchConncetion(long mills) throws InterruptedException{
		synchronized (pool) {
			//完全超时
			if(mills <= 0){
				while(pool.isEmpty()){
					pool.wait();
				}
				return pool.removeFirst();
			}else{
				long future = System.currentTimeMillis() + mills;
				long remaining = mills;
				while(pool.isEmpty() && remaining >0){
					pool.wait(remaining);
					remaining = future - System.currentTimeMillis();
				}
				Connection result = null;
				if(!pool.isEmpty()){
					result = pool.removeFirst();
				}
				return result;
			}
		}
	}

}
