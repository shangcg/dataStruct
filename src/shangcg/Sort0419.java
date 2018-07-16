package shangcg;

public class Sort0419 {

	
	
	
	public static void main(String[] args) {
		int [] a = {5,9,7,8,3,1,2,6,4};
		Sort0419 s = new Sort0419();
		s.heapSort(a);
		for(int i=0;i<a.length; i++){
			System.out.print(a[i]  + " ");
		}
	}
	
	
	//选择排序
	void selectSort(int[] a) {
		int i,j,max;
		for(i=0; i<=a.length-1; i++){
			
			for(j=i+1; j<=a.length-1-i; j++){
				max = j;
				if (a[j]<a[j-1]) {
					max =j-1;
				}
			}
		}
	}
	
	//堆排序----------------------------------------
	void heapSort(int[] a){
		
		int len = a.length-1;
		//构建堆
		for(int i=(a.length/2); i>=0; i--){
			adjust(a,i,len);
		}
		while(len>=0){
			swap(a,0,len--);
			adjust(a,0,len);
		}
	}
	
	void adjust(int[] a,int i,int len){
		//定义左 右下标、左右最大值的下标
		int left, right, max;
		while((left=i*2+1) <= len){
			right = left+1;
			max = left;//默认左节点为大
			if(right<= len && a[left]<a[right]){
				max = right;
			}
			if(a[max]>a[i]){
				swap(a,i,max);
			}else{
				break;
			}
			i = max;
		}
	}
	
	void swap(int[] a,int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	
	
	
	

	
}
