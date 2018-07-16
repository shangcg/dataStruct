package shangcg;


/**
 * 选择排序
 * @author Administrator
 *
 */
public class SelectSort0714 {
	
	private void sort(int[] a){
		
		for(int i=0; i<a.length; i++){
			int min = i;
			
			for(int j=i; j<a.length-1; j++){
				if (a[j] >a[j+1]) {
					min = j+1;
				}
			}
			if (min !=i) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		SelectSort0714 sort =  new SelectSort0714();
		int[] a = BaseTool.newRandomArray();
		BaseTool.printBeforeArray(a);
		sort.sort(a);
		BaseTool.printAfterArray(a);
	}

}
