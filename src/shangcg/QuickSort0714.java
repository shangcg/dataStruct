package shangcg;

import java.util.Random;

public class QuickSort0714 {
	
	
	void sort(int[] a,int left, int right){
		
		int i = left;
		int j = right;
		
		int base = a[left];
		
		if(left<right){
			
			while(i!=j){
				while(i<j && a[j]>=base){
					j--;
				}
				a[i] = a[j];
				while(i<j && a[i]<=base ){
					i++;
				}
				a[j] = a[i];
			}
			a[i] = base;
			sort(a,left,i);
			sort(a,i+1,right);
		}
	}

	public static void main(String[] args) {
		Random random = new Random();
		int[] a = new int[10];
		for(int i =0; i<a.length; i++){
			a[i] = random.nextInt(100);
	
		}
		
		System.out.println("排序前");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		QuickSort0714 sort = new QuickSort0714();
		sort.sort(a,0,a.length-1);
		
		System.out.println("排序后");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
