class Solution {
    Integer prev = null, minDiff = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        if (prev != null) minDiff = Math.min(minDiff, node.val - prev);
        prev = node.val;
        inorder(node.right);
    }
}

public class Q783 {
    
}
