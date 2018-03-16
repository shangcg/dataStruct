package shangcg;

/**
 * 冒泡排序
 * @author shangcg
 *
 */
public class BubbleSort {

	
	
	/**
	 * 排序
	 * @param a
	 */
	void sort(int[] a){
		
		for(int i=0; i<a.length; i++ ){
			for(int j=0; j<a.length-1-i; j++){
				swap(a, j);
			}
		}
		
		print(a);
	}

	/**
	 * 打印数组
	 * @param a
	 */
	private void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	/**
	 * 交换数组大小
	 * @param a
	 * @param i
	 * @param j
	 */
	private void swap(int[] a, int j) {
		int temp = 0;
		if (a[j]>a[j+1]) {
			temp = a[j+1];
			a[j+1] = a[j];
			a[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,2,5,1,4,6,8,7,9,10,-1,11,15,67,45};
		BubbleSort b = new BubbleSort();
		b.sort(a);
	}
}
