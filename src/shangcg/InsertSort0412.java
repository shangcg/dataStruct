package shangcg;

public class InsertSort0412 {

	
	int a[] = {6,5,4,3,2,1};
	
	void sort(){
		int j=0;
		for(int i=1; i<a.length;i++){
			
			int insertNode = a[i];//要插入元素
			j = i-1;
			while(j>=0 && a[j]>insertNode){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = insertNode;
		}
		
		for(int i =0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		InsertSort0412 s = new InsertSort0412();
		s.sort();
	}
}
