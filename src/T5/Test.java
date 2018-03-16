package T5;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		int a[] = new int[10000];
		Random rand = new Random();
		int len = a.length;
		for(int i=0;i<len;i++){
			a[i] = rand.nextInt();
		}
		long start=0,end=0;
		int b[] = new int[len];
		System.arraycopy(a, 0, b, 0, len);
		//冒泡排序
//		start=System.currentTimeMillis();
//		BubbleSort bubbleSort = new BubbleSort(b);
//		bubbleSort.sort();
//		end = System.currentTimeMillis()-start;
//		System.out.println("冒泡排序共花费："+end+"毫秒");
		//希尔排序
//		start=System.currentTimeMillis();
//		ShellSort shellSort = new ShellSort(b);
//		shellSort.shellSort();
//		end = System.currentTimeMillis()-start;
//		System.out.println("希尔排序共花费："+end+"毫秒");
		
		//快速排序
		start=System.currentTimeMillis();
		QuickSort quickSort = new QuickSort(a);
		quickSort.quickSort(quickSort.a, 0, len-1, len);
		quickSort.print();
		end = System.currentTimeMillis()-start;
		System.out.println("快速排序共花费："+end+"毫秒");
		
		
		//堆排序
		start=System.currentTimeMillis();
		HeapSort heapSort = new HeapSort(b);
		heapSort.heapSort(heapSort.a);
		heapSort.print();
		end = System.currentTimeMillis()-start;
		System.out.println("堆排序共花费："+end+"毫秒");
		
		
		
		
		
		
	}
}
