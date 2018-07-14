package shangcg;

import java.util.Random;


public class BaseTool {
	
	
	/**
	 * 随机生成新数组
	 */
	public static int[] newRandomArray(){
		
		
		Random random = new Random();
		int[] a = new int[10];
		for(int i =0; i<a.length; i++){
			a[i] = random.nextInt(100);
	
		}
		
		return a;
	}
	
	
	
	/**
	 * 输出排序之前的数组
	 * @param a
	 */
	public static void printBeforeArray(int[] a){
		System.out.println("排序前");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ,");
		}
		System.out.println("");
		
	}
	
	
	/**
	 * 输出排序后的数组
	 * @param a
	 */
	public static void printAfterArray(int[] a){
		System.out.println("排序后");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ,");
		}
		System.out.println("");
	}

}
