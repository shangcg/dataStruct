package n180712;

/**
 * 测试并发和串行的效率
 * @author shangcg
 * 
 * 
 * long 和 int 对效率的影响差别很大
 * 
 *
 */
public class ConcurrencyTest {
	
	private static long count = 10000000;
	
	
	public static void main(String[] args) throws InterruptedException {
		single();
		multiy();
	}
	
	static void single(){
		
		long start = System.currentTimeMillis();
		
		int a = 0;
		
		int b = 0;
		
		for(long i =0; i<count; i++){
			b += 5;
		}
		
		for(long i =0; i<count; i++){
			a--;
		}
					

		
		long time = System.currentTimeMillis() -start;
		
		System.out.println("单线程用时：" +time + "ms" + "  结果："+ a);
		
	}
	
	static void multiy() throws InterruptedException{
		
		int a = 0;
		
		
		long start = System.currentTimeMillis();
		
		
		Thread t = new Thread(new Runnable() {
			int b = 0;
			public void run() {
				for(long i =0; i<count; i++){
					b+=5;
				}
				
			}
		});
		t.start();
		
		for(long i =0; i<count; i++){
			a--;
		}
		
		t.join();
		
		long time = System.currentTimeMillis() -start;
		
		System.out.println("多线程用时：" +time + "ms" + "  结果："+ a);
		
	}

}
