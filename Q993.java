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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
             boolean foundX = false, foundY = false;
            TreeNode parentX = null, parentY = null;
            for (int i = 0; i < size; i++) {
                TreeNode node=q.poll();
                if (node.left != null) {
                    if(node.left.val==x){
                        foundX=true;
                        parentX=node;
                    }
                     if (node.left.val == y) {
                        foundY = true;
                        parentY = node;
                    }
                    q.add(node.left);

            }
              
                if (node.right != null) {
                    if (node.right.val == x) {
                        foundX = true;
                        parentX = node;
                    }
                    if (node.right.val == y) {
                        foundY = true;
                        parentY = node;
                    }
                    q.add(node.right);
                }
            }
            
          if (foundX && foundY) return parentX != parentY;
            if (foundX || foundY) return false;
        }
        return false;
    }
}
public class Q993 {
    
}
