package shangcg;

public class Sort0417 {

	
	void selectSort(int[] a ){
		
	//---------------------------------写法一
//		int i,j,pos = 0;
//		
//		for(i=0; i<a.length; i++){
//			
//			pos = i;
//			for(j=i+1; j<a.length; j++){
//				if (a[j] <a[pos]) {
//					pos = j;
//				}
//			}
//			int temp = a[pos];
//			a[pos] = a[i];
//			a[i] = temp;
//			
//		}
		
		
		//----------------------------写法二
//		 for (int i = 0; i < a.length; i++) {
//	            int temp = a[i];
//	            int flag = i; // 将当前下标定义为最小值下标
//	            for (int j = i + 1; j < a.length; j++) {
//	                if (a[j] < temp) {// a[j] < temp 从小到大排序；a[j] > temp 从大到小排序
//	                    temp = a[j];
//	                    flag = j; // 如果有小于当前最小值的关键字将此关键字的下标赋值给flag
//	                }
//	            }
//	            if (flag != i) {
//	                a[flag] = a[i];
//	                a[i] = temp;
//	            }
//	        }
		
		
		int i, j, flag=0;
		for(i=0; i<a.length; i++){
			
			flag = i;
			int base = a[i];
			for(j=i+1; j<a.length; j++){
				if (a[j]<base) {
					flag = j;
				}
			}
			int temp = a[flag];
			a[flag] = base;
			a[i] = temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int[]  a = {6,5,4,3,2,1};
		Sort0417 s = new Sort0417();
		s.selectSort(a);
		for(int i=0;i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}
