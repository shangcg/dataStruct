package shangcg;

public class QuickSort1 {

//    public static void quickSort(int arr[],int left,int right){
//        int i = left;
//        int j = right;
//        int baseElement = 0;
//        if(i <= j){   //待排序的元素至少有两个的情况
//            baseElement = arr[i];  //待排序的第一个元素作为基准元素
//            while(i != j){   //从左右两边交替扫描，直到left = j
//
//                while(j > i && arr[j] >= baseElement) {
//                	j --;        //从右往左扫描，找到第一个比基准元素小的元素
//                }
//                  arr[i] = arr[j];  //找到这种元素arr[j]后与arr[i]交换
//
//                while(i < j && arr[i] <= baseElement){
//                	i ++;         //从左往右扫描，找到第一个比基准元素大的元素
//                }
//                  arr[j] = arr[i];  //找到这种元素arr[i]后，与arr[j]交换
//
//            }
//            arr[j] = baseElement;    //基准元素归位
//            quickSort(arr,left,i-1);  //对基准元素左边的元素进行递归排序
//            quickSort(arr, j+1,right);  //对基准元素右边的进行递归排序
//        }        
//    }
	
	  public static void quickSort(int arr[],int left,int right){
	        int i = left;
	        int j = right;
	        if(i <= j){   //待排序的元素至少有两个的情况
	        	int  baseElement = arr[i];  //待排序的第一个元素作为基准元素
	        	System.out.println(baseElement);
	            while(i != j){   //从左右两边交替扫描，直到left = j

	                while(j > i && arr[j] >= baseElement) {
	                	j --;        //从右往左扫描，找到第一个比基准元素小的元素
	                }
	                  arr[i] = arr[j];  //找到这种元素arr[j]后与arr[i]交换

	                while(i < j && arr[i] <= baseElement){
	                	i ++;         //从左往右扫描，找到第一个比基准元素大的元素
	                }
	                  arr[j] = arr[i];  //找到这种元素arr[i]后，与arr[j]交换

	            }
	            arr[j] = baseElement;    //基准元素归位
	            quickSort(arr,left,i-1);  //对基准元素左边的元素进行递归排序
	            quickSort(arr, i+1,right);  //对基准元素右边的进行递归排序
	        }        
	    }
	  
    public static void main(String[] args) {
        int array[] = {5,6,4,1,2,3};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }
        
        quickSort(array,0,array.length-1);

        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }

    }

}
