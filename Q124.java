/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
        private int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;

    }
    private int dfs(TreeNode root){
        if(root==null)return 0;
        int left=Math.max(dfs(root.left),0);
        int right=Math.max(dfs(root.right),0);

        int curr=left+right+root.val;
        maxSum=Math.max(maxSum,curr);

        return root.val+ Math.max(left, right);
    }
}
public class Q124 {
    
}
