package T2;

import java.util.Stack;

public class YuFaCheck {

	public static void main(String[] args) {
		String str="if((a==b)&& (c==d) || (x==y)){}";
		boolean flag=false;
		Stack<Character> stack = new Stack<Character>();
		for (int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='('){
				stack.push(c); //左括号入栈
			}else if(c==')'){
				try{
					stack.pop(); //右括号出栈
				}catch(Exception e){
					System.out.println("少了左括号(");
					flag=true;
				}
			}
			if(c=='{'){
				stack.push(c);
			}else if(c=='}'){
				try{
					stack.pop(); //右括号出栈
				}catch(Exception e){
					System.out.println("少了左括号{");
					flag=true;
				}
			}
		}
		if(!flag && stack.size()==0){
			System.out.println("语法正常");
		}
		if(stack.size()>0){
			System.out.println("少了右括号");
		}
		
	}
}
