package T1;

/*
 * 双链表的节点类
 * 	1.数据域：（可能是一个简单变量，也可能是复杂的类）
 * 	2.链域：下一个节点的地址
 * 
 */
public class DNode {

	String name;
	//前趋节点地址
	DNode prior;
	//后继（续）节点地址
	DNode next;
	public DNode() {
		
	}
	public DNode(String name) {
		this.name = name;
		prior = null;
		next = null;
	}
}
