package n1807;


/**
 * 守护线程 finnally块不一定会执行
 * @author shangcg
 *
 */
public class Dameon {
	
	
	
	public static void main(String[] args) {
		Thread daemon = new Thread(new DaemonRunable(),"DaemonRunableThread");
		
		daemon.setDaemon(true);
		
		daemon.start();
	}
	
	static class DaemonRunable implements Runnable{

		@Override
		public void run() {
			try {
				SleepUtils.second(100);
			}finally {
				System.out.println("Daemon runabble thread finnally");
			}
			
		}
		
	}

}
