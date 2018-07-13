package shangcg;

import java.util.Random;

/**
 * 冒泡排序
 * @author shangcg
 *
 */
public class BubbleSort0712 {
	
	void sort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	
	void print(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		BubbleSort0712 sort = new BubbleSort0712();
		
		Random random = new Random();
		int [] test = new int[20];
		
		//随机产生20个整数
		for (int i = 0; i < test.length; i++) {
			test[i] = random.nextInt(100);
//			test[i] = (int)Math.random()*100;
		}
		
		//排序前的结果
		System.out.println("排序前的结果 :");
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}
		
		sort.sort(test);
		System.out.println("排序后的结果 :");
		for (int i = 0; i < test.length; i++) {
			System.out.println(test[i]);
		}		
		
	}

}
