package shangcg;

public class InsertSot {
	
	int a[] = {5,4,3,2,1};

	public void sort(){
		int temp;
		int j;
		
		for(int i=1; i<a.length; i++){
			temp = a[i];
			for(j=i-1; j>=0 && a[j]>temp; j--){
				a[j+1] = a[j];
			}
			a[j+1] = temp;
		}
		
		for(int i=0; i<a.length ; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		InsertSot s = new InsertSot();
		s.sort();
	}
}
