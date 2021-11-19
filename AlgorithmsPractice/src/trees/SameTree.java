package trees;
import org.junit.Test;

public class SameTree {
	
	public static boolean isSameTree(TreeNode<Integer> p, TreeNode<Integer> q) {
		if ((p == null && q != null) || (q == null && p != null))
			return false;
		if (p != null && q != null) {
			if (p.val != q.val)
				return false;
			return true && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}
		return true;
	}
	
	@Test
	public static void test() {
		TreeNode<Integer> root = new TreeNode<Integer>(1);
		root.addLeftChild(new TreeNode<Integer>(14));
		root.addRightChild(new TreeNode<Integer>(4));
		root.left.addLeftChild(new TreeNode<Integer>(6));
		root.right.addLeftChild(new TreeNode<Integer>(2));
		root.right.addRightChild(new TreeNode<Integer>(24));
		
		TreeNode<Integer >root2 = new TreeNode<Integer>(1);
		root2.addLeftChild(new TreeNode<Integer>(14));
		root2.addRightChild(new TreeNode<Integer>(4));
		root2.left.addLeftChild(new TreeNode<Integer>(6));
		root2.right.addLeftChild(new TreeNode<Integer>(2));
		root2.right.addRightChild(new TreeNode<Integer>(77));
		
		System.out.println(isSameTree(root, root2));
	}
	
	public static void main(String[] args) {
		test();
		
	}
}

/*
 * 3 2 4 1 4 2 3
 * 1 2 3 4 2 4 3
 * 1 2 x 3 2 x 3
 * 
 * 25 15 10 4 12 22 18 24 / 50 35 31 44 70 66 90
 * 							15 10 4  12 22 18 24
 * 
 * 011 010 
 * 011 011
 * 011
 */