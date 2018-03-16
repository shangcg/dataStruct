package shangcg;

/**
 * 树的节点
 * @author shangcg
 *
 */
public class TreeNode {

	int data;
	
	TreeNode leftChild;
	
	TreeNode rightChilde;
	
	TreeNode(int data,TreeNode leftChild, TreeNode rightChild){
		this.data = data;
		this.leftChild = leftChild;
		this.rightChilde = rightChild;
	}
}
