package trees;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaximumDepthBinaryTree {
	public int maxDepth(TreeNode<Integer> root) {
	    if (root == null)
	        return 0;

	    Queue<TreeNode<Integer>> queue = new PriorityQueue<>();
	    queue.add(root);
	    int count = 0;
	    while (!queue.isEmpty()) {
	    	count += 1;
	    	for (int i = 0; i < Math.pow(2, count-1); i++) {
	    		if (!queue.isEmpty()) {
	    			TreeNode<Integer> currentNode = queue.remove();
	    			if (currentNode.left != null)
	    				queue.add(root.left);
	    			if (currentNode.right != null)
	    				queue.add(root.right);
	    		}
	    	}
	    }        
	    return count;
	}

}
