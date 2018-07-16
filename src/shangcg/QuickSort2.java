package shangcg;

public class QuickSort2 {
	
	
	void sort(int[] arr,int left, int right){
		
		int i,j;
		i= left;
		j =right;
		if (i<j) {
			
			int base = arr[i];
			
			while(i!=j){
				
				while(i<j && arr[j]>= base){
					j--;
				}
				arr[i] = arr[j];
				
				while(i<j && arr[i] <=base){
					i++;
				}
				arr[j] = arr[i];
			}
			arr[j] = base;
			sort(arr,left,i-1);
			sort(arr,i+1,right);
		}
		
	
		
	}
	
	public static void main(String[] args) {
		QuickSort2 s = new QuickSort2();
		int a[] = {6,5,4,3,2,1,9,12,11,67,45,32};
		s.sort(a, 0, a.length-1);
		for(int k =0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}

}
