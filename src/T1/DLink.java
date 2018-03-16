package T1;

//链表
public class DLink {

	//定义头节点
	DNode head;
	//初始化
	public DLink() {
		//建表
		head = new DNode();
		head.prior = null;
		head.next = null;
	}
	//新增节点
	public void addNode(String data){
		/*1.获取表头
		 *2.通过表头找到最后一个元素；
		 *3.把新增的节点放到最后一个元素的后面
		 * */
		DNode p = head;
		while(p.next!=null){
			p=p.next;
		}
		//需要新增的节点
		DNode temp = new DNode(data);
		p.next = temp;
		temp.prior = p;
	}
	//删除节点
	public void delNode(String data){
		/*1.获取表头
		 *2.通过表头找到最后一个元素；
		 *3.把最后一个元素删除
		 * */
		DNode p = head;
		while(p.next!=null){
			//删除节点
			if(p.next.name.equals(data)){
				//顺序不能换
				p.next.next.prior=p.next.prior;
				p.next = p.next.next;
				
				
				break;
			}else{
				p=p.next;
			}
			
		}
	}
	//遍历
	public void display(){
		DNode p = head;
		//从头到尾
		System.out.println("从头到尾------------------------");
		while(p.next!=null){
			System.out.println(p.next.name+"->>");
			p=p.next;
		}
		//从尾到头
		System.out.println("从尾到头-------------------------");
		while(p.prior!=head){
			System.out.println(p.name+"->>");
			p=p.prior;
		}
		System.out.println(p.name+"->>");
	}
	//查找
	public void findNode(String data){
		/*1.获取表头
		 *2.通过表头找到最后一个元素；
		 *3.把最后一个元素删除
		 * */
		DNode p = head;
		while(p.next!=null){
			//删除节点
			if(p.next.name.equals(data)){
				System.out.println("data="+p.next.name);
				break;
			}else{
				p=p.next;
			}
			
		}
	}
	//插入节点
	public void insertNode(String param,String data){
		
		/*param表示新增的节点要插入到该节点的后面
		 * 
		 *1.获取表头
		 *2.通过表头找到param元素的节点；
		 *3.把新增的节点放到改节点的后面
		 * */
		DNode p = head;
		while(p.next!=null){
			if(p.next.name.equals(param)){
				DNode t = p.next;
				DNode insertNode = new DNode(data);
				
				insertNode.next = t.next;
				t.next.prior = insertNode;
				t.next = insertNode;
				insertNode.prior = t;
				break;
			}else{
				p=p.next;
			}
		}
	}
	//链表大小
	public int size(){
		int n=0;
		DNode p = head;
		while(p.next!=null){
			p=p.next;
			n++;
		}
		return n;
	}
	public static void main(String[] args) {
		DLink link = new DLink();
		link.addNode("组长");
		link.addNode("部门经理");
		link.addNode("主管副总");
		link.addNode("总经理");
		link.display();
		System.out.println("size="+link.size());
		link.delNode("部门经理");
		link.display();
		System.out.println("---------------------------");
		link.insertNode("组长", "部门经理");
		link.display();
	}
}
