package n180712;


/**
 * 打印等腰三角形
 * @author shangcg
 *
 */
public class Dengyao {
	
	
	 public static void main(String[] args) {
	        for(int i=1;i<=5;i++){//i--控制行
	            for(int j=5-i;j>=0;j--){//j--控制空格的数量
	                System.out.print(" ");
	            }
	            for(int k=1;k<=2*i-1;k++){//k--控制*的数量
	                System.out.print("*");
	            }
	            System.out.println();//每循环一次换行
	        }
	    }

}
