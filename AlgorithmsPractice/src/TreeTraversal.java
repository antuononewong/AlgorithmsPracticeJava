import org.junit.Test;

public class TreeTraversal {
	
	public TreeNode<Integer> root;
	
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
	
	public static void preorderTraversal(TreeNode<Integer> node) {
		if (node == null)
			return;
		else {
			System.out.print(node.val + " ");
			preorderTraversal(node.left);
			preorderTraversal(node.right);
		}
	}
	
	public static void inorderTraversal(TreeNode<Integer> node) {
		if (node == null)
			return;
		else {
			inorderTraversal(node.left);
			System.out.print(node.val + " ");
			inorderTraversal(node.right);
		}
	}
	
	public static void postorderTraversal(TreeNode<Integer> node) {
		if (node == null)
			return;
		else {
			postorderTraversal(node.left);
			postorderTraversal(node.right);
			System.out.print(node.val + " ");
		}
	}
	
	@Test
	public void test() {
		root = new TreeNode<Integer>(1);
		root.addLeftChild(new TreeNode<Integer>(14));
		root.addRightChild(new TreeNode<Integer>(4));
		root.left.addLeftChild(new TreeNode<Integer>(6));
		root.right.addLeftChild(new TreeNode<Integer>(2));
		root.right.addRightChild(new TreeNode<Integer>(24));
		
		preorderTraversal(root);
		System.out.println();
		inorderTraversal(root);
		System.out.println();
		postorderTraversal(root);
		System.out.println();
	}
	
	public static void main(String[] args) {
		TreeTraversal tt = new TreeTraversal();
		tt.test();
	}

}
/*
 *     1
 *   14  4
 *  6 x 2 24
 * 
 * pre - 25 15 10 4 12 22 18 24 50 35 31 44 70 66 90
 * in - 4 10 12 15 18 22 24 25 31 35 44 50 66 70 90
 * post - 4 12 10 18 24 22 15 31 44 35 66 90 70 50 25
 */


