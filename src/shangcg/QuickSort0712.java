package shangcg;

public class QuickSort0712 {
	
	
	void sort(int[] arr, int left, int right){
		
		int i =left;
		int j = right;
		
		int base = arr[left];
		
		while(i!=j){
			while(i<j && arr[j] > base){
				j--;
			}
			arr[i] = arr[j];
			
			while(i<j && arr[i] <base){
				i++;
			}
			arr[j] = arr[i];
		}
		
	}

}
