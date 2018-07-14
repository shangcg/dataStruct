package shangcg;

/**
 * 插入排序
 * @author shangcg
 *
 */
public class InsertSort {
	
	void sort(int[] a ){
		
		for(int i=1; i<a.length; i++){
			int j =i;
			while(j>0 && a[j]<a[j-1]){
				int temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				j--;
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		InsertSort sort = new InsertSort();
		int[] a = BaseTool.newRandomArray();
		BaseTool.printBeforeArray(a);
		sort.sort(a);
		BaseTool.printAfterArray(a);
		
	}

}
