package n1807;import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 等待通知机制
 * @author shangcg
 *
 */
public class WaitNotify {
	
	static boolean flag = true;
	static Object lock = new Object();
	
	
	public static void main(String[] args) {
		Thread wait = new Thread(new Wait(),"wait Thread");
		wait.start();
		
		Thread notify = new Thread(new Notify()," notify Thread");
		notify.start();
	}
	
	static class Wait implements Runnable{

		@Override
		public void run() {
			//加锁 拥有lock的Monitor
			synchronized (lock) {
				//条件不满足 继续wait 同时释放了lock的锁
				while(flag){
					try {
						System.out.println(Thread.currentThread()+ "flag is true .wait @"
								+new SimpleDateFormat("HH:mm:ss").format(new Date()));
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				//条件满足 完成工作
				System.out.println(Thread.currentThread()+"flag is false .running @"
						+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
			}
			
		}
		
	}
	
	
	static class Notify implements Runnable{

		@Override
		public void run() {
			//加锁 拥有lock的Monitor
			synchronized (lock) {
				System.out.println(Thread.currentThread() +" hold lock. notify @"
							+ new SimpleDateFormat("HH:mm:ss").format(new Date()));
				 //调用 notify wait的线程不会立即从wait返回，而是从等待队列移动到同步队列 变成阻塞状态,
				 //只有当调用notify的线程释放对象锁以后，wait线程拿到锁后才会从wait方法返回
				lock.notifyAll();   
				flag = false;
				SleepUtils.second(5);
				
			}
			
			synchronized(lock){
				System.out.println(Thread.currentThread() + "hold lock again .sleep @"
			          + new SimpleDateFormat("HH:mm:ss").format(new Date()));
			}
			
		}
		
	}
	
	//等待通知机制经典范式
	
//	synchronized(对象){
//		while(true){
//			对象.wait();
//		}
//		
//		//执行正常逻辑
//		
//	}

}
