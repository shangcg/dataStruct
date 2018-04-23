package shangcg;

/**
 * 快速排序
 * @author shangcg
 *
 */
public class QuickSort {
	
//	//不断交换数据位置进行排序  并返回中值的下标
//	int partion(int[] arr,int low,int high){
//		
//		//获取标志值，也就是中值
//		int middle = arr[low];
//		
//		
//		while(low<high){
//			
//			//右侧指针递减，直到右侧值小于了中值
//			while(low <high && arr[high] >= middle){
//				high--;
//			}
//			
//			arr[low] = arr[high];
//			
//			while(low<high && arr[low] <=middle){
//				low++;
//			}
//			
//			arr[high] = arr[low];
//		}
//		
//		arr[low] = middle;
//		return low;
//		
//	}
////	
//	//递归处理每一段数据，直到两个指针重合
//	void quickSort(int[] arr,int low,int high){
//		if (low<high) {
//			int mid = partion(arr, low, high);
//			//拿到中值以后分别对左右两端数据进行排序
//			quickSort(arr, low, mid);
//			quickSort(arr,mid+1,high);
//		}
//	}
	
	void quick(int arr[],int low,int high){
		if (arr.length>0) {
//			int low =0;
//			int high=arr.length-1;
			if (low<high) {
//				int mid = partion(arr, low, high);
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
				int mid= low;
				//拿到中值以后分别对左右两端数据进行排序
				quick(arr, low, mid);
				quick(arr,mid+1,high);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {6,5,4,3,2,1};
		QuickSort q = new QuickSort();
		q.quick(a,0,a.length-1);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
