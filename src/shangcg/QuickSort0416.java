package shangcg;

public class QuickSort0416 {
	
	
	/**
	 * 快排
	 * @param arr
	 * @param left
	 * @param right
	 */
	void sort(int[] arr, int left,int right){
		
		int i=left;
		int j = right;
		
		while(i<j){
			
			int base = arr[i];
			
			while(i != j){
				
				while(i<j && arr[j] > base){
					j--;
				}
				arr[i] = arr[j];
				
				while(i<j && arr[i] < base){
					i++;
				}
				arr[j] = arr[i];
			}
			arr[j] = base;
			sort(arr,left,i-1);
			sort(arr,i+1,right);
		}
	}
	
	
	void shellSort(int[] a){
		int i,j,d;
		
		for(d =a.length/2; d>0; d/=2){
			
			for(i=0; i<a.length; i++){
				
				for(j=i+d; j<a.length; j+=d){
					
					int insertNode = a[j];
					while(j-d>=i && a[j-d] >insertNode){
						a[j] = a[j-d];
						j -=d;
					}
					a[j] = insertNode;
				}
			}
		}
	}
	
	void bubbleSort(int[] a){
		int i,j;
		
		for(i=0; i<a.length-1 ;i++){
			
			for(j=0; j<a.length-1 -i; j++){
				
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}

			
		}
	}
	
	public static void main(String[] args) {
		
		int a[]= {6,5,4,3,2,1};
		QuickSort0416 s = new QuickSort0416();
//		s.sort(a, 0, a.length-1);
		
//		s.shellSort(a);
		
		s.bubbleSort(a);
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
		
		
		
	}

}
