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
    public void flatten(TreeNode root) {
        if(root==null)return;
       
        TreeNode leftN=root.left;
        TreeNode rightN=root.right;
           root.left=null;
        flatten(leftN);
        flatten(rightN);
        root.right=leftN;
        TreeNode temp=leftN;
        while(temp!=null&&temp.right!=null){
            temp=temp.right;
        }
        if(temp!=null) temp.right=rightN;
        else root.right=rightN;
        return;
    }
}
public class Q114 {
    
}
