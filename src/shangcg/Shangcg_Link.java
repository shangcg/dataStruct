package shangcg;


//单向链表
public class Shangcg_Link {
	
	Node head  = null;
	Shangcg_Link(){
		head  = new Node();

	 }

	 void add(String data){
		Node p = head;
	        //链表的添加需要在尾部添加，因此需要找到尾部节点
	        while(p.next !=null){
			p = p.next;
	 	}

	        p.next = new Node(data);
	 }

	 void del(String data){
	    	Node p = head;
	        //删除就是遍历该链表 找到要删除的数据，把指针指向的数据域改掉
	        while(p.next!=null){
			if(p.next.data .equals(data)){
				p.next = p.next.next;
			}
			p = p.next;
		}
		//如果恰好是最后一个元素，应该多一个判断
//		if(p.next.data.equals(data)){
//				p.next = p.next.next;
//		}
	 }

	 void disPlay(){
		//单向链表只有后驱，要从头遍历
		Node p = head;
		while(p.next!=null){
			System.out.print(p.next.data);
			p = p.next;
	  	}
	 }

	 void find(String data){
		Node p  = head;
		while(p.next!=null){
			if(p.next.data .equals(data)){
				System.out.print(p.next.data);
			}
		}
	 }
	 
	 public static void main(String args[]){
		 Shangcg_Link link = new Shangcg_Link();
		 	link.add("A");
			link.add("B");
			link.add("C");
			link.add("D");
			link.add("E");
			
			System.out.println("1+++++++++++++");
			link.disPlay();
			
			System.out.println("2+++++++++++++");
			link.add("F");
			link.disPlay();
			
			System.out.println("3+++++++++++++");
			link.del("B");
			link.disPlay();
			
		 }
}
