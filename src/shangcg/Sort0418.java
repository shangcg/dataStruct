package shangcg;

public class Sort0418 {
	
	
	static void heapSort(int[] a){
		int len = a.length-1;
		//构建堆   最后一个非叶节点就是  a.length/2，从最后一个非叶节点开始向上
		
		for(int i=(len-1/2); i>=0 ;i--){
			//i 代表父节点  len是长度
			adjust(a,i,len);
		}
		
		while (len >= 0) {
			swap(a, 0, len--); // 将堆顶元素与尾节点交换后，长度减1，尾元素最大
			adjust(a, 0, len); // 再次对堆进行调整
		}
	}
	
	static void adjust(int[] a, int i,int len){
		
		//定义出 左子节点 右子节点 左右子几点的最大值
		
		int left,right,max;

		
		while((left= 2*i+1) <= len){
			right = left+1;
			max = left; //默认左子节点为大
			if (right <= len && a[left] < a[right]) {
				max= right;
			}
			
			if (a[i]<a[max]) {
				swap(a,i,max);
			}else{
				break;
			}
			
			i=max;
			
			
		}
	}
	
	static void swap(int[] a ,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void main(String[] args) {
		
			int array[] = {5,9,7,8,3,1,2,6,4};
			System.out.println("排序之前：");
			for (int element : array) {
				System.out.print(element + " ");
			}
			heapSort(array);
			System.out.println("\n排序之后：");
			for (int element : array) {
				System.out.print(element + " ");
			}
		}


}
