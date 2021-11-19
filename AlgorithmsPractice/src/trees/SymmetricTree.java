import java.util.ArrayList;

public class SymmetricTree {
	public boolean isSymmetric(TreeNode<Integer> root) {
        if (root == null)
            return false;

        ArrayList<Integer> nodeValues = new ArrayList<Integer>();
        inorderTraversal(root, nodeValues);
        return checkEquals(nodeValues);
    }
    
    public void inorderTraversal(TreeNode<Integer> node, ArrayList<Integer> nodeValues) {
        if (node == null)
        	nodeValues.add(-1);
        else {
            inorderTraversal(node.left, nodeValues);
            nodeValues.add(node.val);
            inorderTraversal(node.right, nodeValues);
        }
    }

    public boolean checkEquals(ArrayList<Integer> nodeValues) {
        int start = 0;
        int end = nodeValues.size() - 1;
        while (start < end) {
            if (nodeValues.get(start) != nodeValues.get(end))
            	return false;
        }
        return true;
    }

}
