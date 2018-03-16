package shangcg;

/*
 * 节点类
 * 	1.数据域：（可能是一个简单变量，也可能是复杂的类）
 * 	2.链域：下一个节点的地址
 * 
 */

//单向链表
public class Node {

	String data;
	//自引用,下一个节点的地址
	Node next;
	public Node() {
		
	}
	public Node(String data) {
		this.data = data;
		next = null;
	}
}
