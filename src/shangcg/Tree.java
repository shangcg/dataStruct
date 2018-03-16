package shangcg;

import java.util.LinkedList;

public class Tree {

	
	TreeNode root;
	
	Tree(){
		TreeNode f  = new TreeNode(7 ,null, null);
		TreeNode e  = new TreeNode(6 ,null, null);
		TreeNode d  = new TreeNode(5 ,null, null);
		TreeNode c  = new TreeNode(4 ,null, null);
		TreeNode b  = new TreeNode(3 ,e, f);
		TreeNode a  = new TreeNode(2 ,c, d);
		TreeNode r  = new TreeNode(1 ,a, b);
		root =r;
	}
	
	//树的三种遍历 
	void display(TreeNode treeNode){
		
		//如果前序遍历，则就是根左右，下边输出就是前序遍历结果
//		System.out.println(treeNode.data);
		
		//往左侧一直遍历
		if (treeNode.leftChild !=null) {
			display(treeNode.leftChild);
		}
		
		//如果是中序遍历，则左根右， 下边输出就是中序遍历结果
//		System.out.println(treeNode.data);
		
		
		//往右侧一直遍历
		if (treeNode.rightChilde!=null) {
			display(treeNode.rightChilde);
		}
		
//		//如果是后续遍历则，则就是左右根，下边输出就是后续遍历结果
		System.out.println(treeNode.data);
	}
	
	
//	public void levelIterator(TreeNode root)  
//	  {  
//	      if(root == null)  
//	      {  
//	          return ;  
//	      }  
//	      LinkedList<TreeNode> queue = new LinkedList<TreeNode>();  
//	      TreeNode current = null;  
//	      queue.offer(root);//将根节点入队  
//	      while(!queue.isEmpty())  
//	      {  
//	          current = queue.poll();//出队队头元素并访问  
//	          System.out.print(current.data +"-->");  
//	          if(current.leftChild != null)//如果当前节点的左节点不为空入队  
//	          {  
//	              queue.offer(current.leftChild);  
//	          }  
//	          if(current.rightChilde != null)//如果当前节点的右节点不为空，把右节点入队  
//	          {  
//	              queue.offer(current.rightChilde);  
//	          }  
//	      }  
//	        
//	  }  
	
	void levelIterator(TreeNode treeNode){
		
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(treeNode);
		while(!queue.isEmpty()){
			TreeNode current = queue.poll();
			System.out.print(current.data);
			if (current.leftChild != null) {
				queue.offer(current.leftChild);
			}
			if (current.rightChilde!= null) {
				queue.offer(current.rightChilde);
			}
		}
	}
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.display(tree.root);
		
		//层级遍历
		System.out.println("层级遍历开始--------------------");
		tree.levelIterator(tree.root);
	}
}
