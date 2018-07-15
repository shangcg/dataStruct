package n1807;

import java.util.concurrent.TimeUnit;

/**
 * 终止线程
 * @author shangcg
 *
 */
public class ShutDown {
	
	
	public static void main(String[] args) throws InterruptedException {
		TestRunabler runable1 = new TestRunabler();
		Thread thread1 = new Thread(runable1,"thread1");
		thread1.start();
		TimeUnit.SECONDS.sleep(1);
		
		thread1.interrupt();
		
		TestRunabler runabbler2 = new TestRunabler();
		Thread thread2 = new Thread(runabbler2,"thread2");
		thread2.start();
		TimeUnit.SECONDS.sleep(1);
		runabbler2.cancel();
				
	}
	
	static class TestRunabler implements Runnable{
		
		private int i =0;
		
		private volatile boolean on = true;

		@Override
		public void run() {
			while(on && !Thread.currentThread().isInterrupted()){
				i++;
			}
			System.out.println("Count i =" +i);
		}
		
		public void cancel(){
			on = false;
		}
		
	}

}
