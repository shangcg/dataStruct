package shangcg;


/**
 * 冒泡排序
 * @author shangcg
 *
 */
public class BubbleSort0714 {
	
	private  void sort(int[] a){
		for(int i =0; i<a.length; i++){
			for(int j=0; j < a.length-1-i; j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BubbleSort0714 sort = new BubbleSort0714();
		
		int[] a = BaseTool.newRandomArray();
		
		BaseTool.printBeforeArray(a);
		sort.sort(a);
		BaseTool.printAfterArray(a);
	}

}
