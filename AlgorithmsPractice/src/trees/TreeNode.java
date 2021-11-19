package trees;

public class TreeNode<T> {
	
	T val;
	TreeNode<T> left;
	TreeNode<T> right;
	
	public TreeNode(T val) {
		this.val = val;
	}
	
	public void addLeftChild(TreeNode<T> node) {
		left = node;
	}
	
	public void addRightChild(TreeNode<T> node) {
		right = node;
	}
	
}
