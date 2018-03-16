package shangcg;

/**
 * 快速排序
 * @author shangcg
 *
 */
public class QuickSort {
	
	//不断交换数据位置进行排序  并返回中值的下标
	int partion(int[] arr,int low,int high){
		
		//获取标志值，也就是中值
		int middle = arr[low];
		
		
		while(low<high){
			
			//右侧指针递减，直到右侧值小于了中值
			while(low <high && arr[high] >= middle){
				high--;
			}
			
			arr[low] = arr[high];
			
			while(low<high && arr[low] <=middle){
				low++;
			}
			
			arr[high] = arr[low];
		}
		
		arr[low] = middle;
		return low;
		
	}
	
	//递归处理每一段数据，直到两个指针重合
	void quickSort(int[] arr,int low,int high){
		if (low<high) {
			int mid = partion(arr, low, high);
			//拿到中值以后分别对左右两端数据进行排序
			quickSort(arr, low, mid);
			quickSort(arr,mid+1,high);
		}
	}
	
	void quick(int arr[]){
		if (arr.length>0) {
			quickSort(arr, 0, arr.length-1);
		}
	}
	
	public static void main(String[] args) {
		int[] a = {3,5,2,1,7,4,8,12,14,13,16,23,25,18,21,45,67,32,45};
		QuickSort q = new QuickSort();
		q.quick(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
