package n1807;


/**
 * 终止线程
 * @author shangcg
 *
 */
public class ShutDown {
	
	static class testRunabler implements Runnable{
		
		private int i =0;
		
		private volatile boolean on = true;

		@Override
		public void run() {
			while(on && !Thread.currentThread().isInterrupted()){
				i++;
			}
		}
		
		public void cancel(){
			on = false;
		}
		
	}

}
