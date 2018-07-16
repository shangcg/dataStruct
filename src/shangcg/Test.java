package shangcg;

import java.math.BigDecimal;

public class Test {
	
	public static final BigDecimal INT_100 = new BigDecimal(100);
	
	public static void main(String[] args) {
		
		
//		long a = 649800;
//		
//		int b =20000 ;
//		
//		long c= (a/b);
//		
//		
//		int f = INT_100(b);
//		
//		System.out.println(f);
//		int d=(int) (a/(b*0.01));
//		
//		System.out.println(d);
		
		
		
    	int [] a = {6,5,4,3,2,1};
    	System.out.println(a.length);
    	
    	int c = 5/2;
    	System.out.println(c);
//		
		
	}
	
	
    public static int INT_100(float num) {
        return (new java.math.BigDecimal(String.valueOf(num))).divide(INT_100).intValue();
    	

    }

}
