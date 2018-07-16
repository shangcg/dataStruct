package shangcg;

public class InsertSort1 {

	
	int a [] = {6,5,4,3,2,1};
	
	void sort(){
		for(int i=1; i<a.length; i++){
			int insertNode = a[i];
			int k =i-1;
			while(k>=0 && a[k]>insertNode){
				a[k+1] = a[k];
				k--;
			}
			a[k+1]=insertNode;
				
		}
		
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		InsertSort1 s = new InsertSort1();
		s.sort();
	}
}
