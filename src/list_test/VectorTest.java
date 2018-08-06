package list_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Vector使用demo
 * @author shangcg
 *
 */
public class VectorTest {
	
	
	private final List data;
	
	public VectorTest(){
		data = new ArrayList<>();
	}
	
	
	public  void test() {
		
		
//		//创建Vector
//		Vector vector = new Vector<>();
//		
//		//添加数据
//		vector.add("1");
//		vector.add("2");
//		vector.add("3");
		
		
		
		data.add("1");
		data.add("2");
		data.add("3");
		System.out.println(data.size());
		
		data.clear();
		
		System.out.println(data.size());
		
		data.get(10);
	}
	
	public static void main(String[] args) {
		VectorTest test = new VectorTest();
		test.test();
	}

}
