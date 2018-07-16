package n1807;

/**
 * 线程的状态
 * @author shangcg
 * 
 * jps 
 * jstack
 *
 */
public class ThreadState {
	
	
	public static void main(String[] args) {
		
		new Thread(new TimeWaiting(),"TimeWaitingThread").start();;
		
		new Thread(new Waiting(),"WaitingThread").start();
		
		new Thread(new Blocked(),"BlockedThread1").start();
		
		new Thread(new Blocked(),"BlocketThread2").start();
	}
	
	
	
	
	//该线程不断进行
	static class TimeWaiting implements Runnable{

		@Override
		public void run() {
			while(true){
				SleepUtils.second(100);
			}
			
		}
		
	}
	
	
	//在Waiting.class实例上等待
	static class Waiting implements Runnable{

		@Override
		public void run() {
			while(true){
				synchronized (Waiting.class) {
					try {
						Waiting.class.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}
		
	}
	
	
	//在Blocked.class 实例上加锁后 不会释放锁
	static class Blocked implements Runnable{

		@Override
		public void run() {
			synchronized (Blocked.class) {
				while(true){
					SleepUtils.second(100);
				}
			}
			
		}
		
	}

}
