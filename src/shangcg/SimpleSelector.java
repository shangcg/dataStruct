package shangcg;

public class SimpleSelector {
	
	void selectorSort(int[] a){
		for(int i=0; i<a.length-1; i++){
			for(int j=i+1;j<a.length-1;j++){
				if(a[j]<a[j-1]){
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
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
