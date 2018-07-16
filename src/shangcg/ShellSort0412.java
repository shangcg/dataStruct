package shangcg;

public class ShellSort0412 {

	int a[] = {6,5,4,3,2,1};
	
	void sort(){
		
		//希尔排序 就是缩小增量排序
		/**
		 * 1 确定增量因子 长度一直除以2 直到等于1 就是第一层循环 对增量因子的控制
		 * 2 对整个数组的控制 ，也就是增量因子把数组分成了几组，用i 小于增量因子 ，第二层循环
		 * 3 针对每一组使用插入排序
		 * 
		 */
		int i,j,d;
		
		for(d=a.length/2; d>0; d /=2){
			
			for(i=0; i<d; i++){
				
				
				for(j=i+d; j<a.length; j+=d ){
					
					int insertNode = a[j];
					
					while(j-d>=i  && a[j-d] >insertNode){
						a[j] = a[j-d];
						j = j-d;
					}
					
					a[j] = insertNode;
					
				}
				
			}
		}
		
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
		
	}
	
	public static void main(String[] args) {
		ShellSort0412 s =new ShellSort0412();
		s.sort();
	}

}
