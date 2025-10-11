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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> In=new ArrayList<>();
        InOrder(root,In);
        return In;
    }
    public void InOrder(TreeNode root,List<Integer> in){
        if(root==null)return;
        InOrder(root.left,in);
        in.add(root.val);
        InOrder(root.right,in);
    }

}
public class Q94 {
    
}
