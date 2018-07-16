package shangcg;

public class SimpleSelector {
	
	void selectorSort(int[] a){
		
		for(int i=0; i<a.length; i++){
			
			int min = i;
			
			for(int j=i; j<a.length; j++){
				if(a[j] < a[min]){
					min = j;
				}
			}
			
			if(min != i){
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
	}
	

	public static void main(String[] args) {
		int [] a = {1,3,5,4,8,7,6,9};
		SimpleSelector s = new SimpleSelector();
		s.selectorSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
