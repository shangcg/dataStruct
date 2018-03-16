package T6;

import java.util.Random;
import java.util.Scanner;

import T5.BubbleSort;

public class DMiddleSearch {
	/*
	 * 折半查找：
	 * 	前提条件：数组必须有序
	 * */
	int a[];
	
	public DMiddleSearch() {
		a = new int[10];
		Random rnd = new Random();
		for(int i=0;i<a.length;i++){
			a[i]=Math.abs(rnd.nextInt(100));
		}
		sort();
	}
	public DMiddleSearch(int size) {
		a = new int[size];
		Random rnd = new Random();
		for(int i=0;i<a.length;i++){
			a[i]=Math.abs(rnd.nextInt(1000));
		}
		//第一步：排序
		sort();
	}
	//排序
	public void sort(){
		//第一步：排序
		BubbleSort sort = new BubbleSort(a);
		sort.sort();
		a = sort.getA();
	}
	int cnt = 0;
	public void search(int left,int right,int key){
		int mid=0;
		/**
		 * 查找的退出条件left>right
		 * 
		 * */
		//第二步:查找
		if(left>right){
			System.out.println("查无此数");
			return;
		}else{
			cnt++;//统计查找次数
			//改变mid的值
			mid=(left+right)/2;
			System.out.println("left="+left+";mid="+mid+";right="+right+";a[mid]="+a[mid]);
			if(key>a[mid]){//查后半部分
				left = mid+1;
				//递归调用自己
				search(left,right,key);
			}else if(key<a[mid]){
				right = mid-1;
				//递归调用自己
				search(left,right,key);
			}else{
				System.out.println("在第"+(mid+1)+"个位置找到了"+key+",共找了"+cnt+"次！");
				return;
			}
		}
	}
	public static void main(String[] args) {
		DMiddleSearch middle = new DMiddleSearch(100);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要查找的数据：");
		int key  = input.nextInt();
		middle.search(0,middle.a.length-1,key);
	}
}
