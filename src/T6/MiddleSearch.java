package T6;

import java.util.Random;
import java.util.Scanner;

import T5.BubbleSort;

public class MiddleSearch {
	/*
	 * 折半查找：
	 * 	前提条件：数组必须有序
	 * */
	int a[];
	
	public MiddleSearch() {
		a = new int[10];
		Random rnd = new Random();
		for(int i=0;i<a.length;i++){
			a[i]=Math.abs(rnd.nextInt(100));
		}
		sort();
	}
	public MiddleSearch(int size) {
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
	public boolean search(int key){
		int left =0;
		int right=a.length-1;
		int mid=0;
		int cnt = 0;
		/**
		 * 查找的退出条件left>right
		 * 
		 * */
		
		//第二步:查找
		while(left<=right){
			cnt++;//统计查找次数
			//改变mid的值
			mid=(left+right)/2;
			System.out.println("left="+left+";mid="+mid+";right="+right+";a[mid]="+a[mid]);
			if(key>a[mid]){//查后半部分
				left = mid+1;
			}else if(key<a[mid]){
				right = mid-1;
			}else{
				System.out.println("在第"+(mid+1)+"个位置找到了"+key+",共找了"+cnt+"次！");
				return true;
			}
		}
		if(left>right){
			System.out.println("查无此数");
		}
		return false;
	}
	public static void main(String[] args) {
		MiddleSearch middle = new MiddleSearch(100);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要查找的数据：");
		int key  = input.nextInt();
		middle.search(key);
	}
}
