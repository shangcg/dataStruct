package n1807;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 测试数据库连接池
 * @author shangcg
 *
 */
public class ConnectionPoolTest {
	
	//初始化连接池大小
	static ConnectionPool pool = new ConnectionPool(10);
	
	//保证所有ConnectionRunner一起进行
	static CountDownLatch start = new CountDownLatch(1);
	
	static CountDownLatch end;
	
	
	
	
	
	static class ConnectionRunnner implements Runnable{
		
		int count;
		AtomicInteger got;
		AtomicInteger notGot;
		
		public ConnectionRunnner(int count, AtomicInteger got, AtomicInteger notGot) {
			this.count = count;
			this.got = got;
			this.notGot = notGot;
		}

		@Override
		public void run() {
			try{
				start.await();
			}catch (Exception e) {
				
			}
			while(count > 0){
				try {
					Connection conn = pool.fetchConncetion(1000);
					if(conn != null){
						try {
							conn.createStatement();
							conn.commit();
						} finally {
							pool.releaseConnection(conn);
							got.incrementAndGet();
						}
					}else{
						notGot.incrementAndGet();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}finally{
					count --;
				}
			}
			end.countDown();
			
		}
		
	}

}
