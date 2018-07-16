package shangcg;

/**
 * 希尔排序
 * @author shangcg
 *
 */
public class ShellSort2 {
	
	
	int a[] = {6,5,4,3,2,1};
	
	void sort(){
		
		int i,j,d;
		for(d=a.length/2; d>0; d /=2){ //一层 控制增量因子
			
			for(i=0; i<d; i++){// 二层 控制数组小标 ，管理每一组
				
				for(j=i+d; j<a.length; j+=d){ //三层 处理要插入的元素
					
					int insertNode = a[j];
					
					while(j-d>=0 && a[j-d]>insertNode){
						a[j] = a[j-d];
						j-=d;
					}
					a[j] = insertNode;
				}
			}
		}
		
		for(int k=0; k<a.length; k++){
			System.out.println(a[k]);
		}
	}
	
	public static void main(String[] args) {
		ShellSort2 s = new ShellSort2();
		s.sort();
	}
}
