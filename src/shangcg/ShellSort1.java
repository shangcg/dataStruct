package shangcg;

public class ShellSort1 {
	

	void sort(){
		int a[] = {6,5,4,3,2,1};
		
		int i,j,d;
		for(d=a.length/2; d>0; d /=2){
			
			for(i=0; i<d; i++){
				
				for(j=i+d;j<a.length; j +=d){
					
					int inserNode = a[j];
					
					while(j-d>=i && a[j-d]>inserNode){
						a[j]=a[j-d];
						j=j-d;
					}
					a[j] = inserNode;
				}
			}
		}
		
		for(int m=0; m<a.length ;m++){
			System.out.println(a[m]);
		}
	}
	
	public static void main(String[] args) {
		ShellSort1 s = new ShellSort1();
		s.sort();
	}

	
}
