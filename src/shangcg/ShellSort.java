package shangcg;

public class ShellSort {
	
	int a[] = {6,5,4,3,2,1};
	
	void sort(){
		int i ,j,d;
		
		for(d=a.length/2; d>0;d /= 2){
			System.out.println("此时增量因为为："+d);
			
			for(i=0;i<d;i++){
				System.out.println("此时我是第"+i+"组");
				
				for(j=i+d; j<a.length; j+=d){
//					int temp=a[j];
//					int k = j-d;
//					while(k>i && temp<a[k]){
//						a[k+d]=a[k];
//						k = k-d;
//					}
//					a[k+d] = temp;
					
					int insertNode = a[j];
					while(j-d>=i&& a[j-d]>insertNode){
						a[j]=a[j-d];
						j=j-d;
//						print();
					}
					a[j]=insertNode;
				}
			}
		}
		
		for(int m =0;m<a.length;m++){
			System.out.println(a[m]);
		}
	}
	
	public static void main(String[] args) {
		ShellSort s = new ShellSort();
		s.sort();
	}

}
