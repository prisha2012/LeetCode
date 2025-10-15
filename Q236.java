/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean contains(TreeNode root,TreeNode node){
        if(root==null)return false;
        if(root==node)return true;
        return contains(root.left,node)||contains(root.right,node);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if(p==root||q==root)return root;ac
      if(p==q)return p;
      boolean leftp=contains(root.left,p);
      boolean rightp=contains(root.right,q);
      if(leftp&&rightp||(!leftp&&!rightp))return root;
      if(leftp==true&&rightp==false) return lowestCommonAncestor(root.left,p,q);
      if(leftp==false&&rightp==true) return lowestCommonAncestor(root.right,p,q);
      return root;


    }
}
public class Q236 {
    
}
