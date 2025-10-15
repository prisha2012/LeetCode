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
    public int widthOfBinaryTree(TreeNode root) {
         if (root == null) return 0;
        
        int maxWidth = 0;
        Queue<Pair<TreeNode, Long>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, 1L));
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            long min = queue.peek().getValue();  // index of first node
            long first = 0, last = 0;
            
            for (int i = 0; i < size; i++) {
                Pair<TreeNode, Long> current = queue.poll();
                TreeNode node = current.getKey();
                long index = current.getValue() - min; // normalize to prevent overflow
                
                if (i == 0) first = index;
                if (i == size - 1) last = index;
                
                if (node.left != null) 
                    queue.offer(new Pair<>(node.left, index * 2));
                if (node.right != null) 
                    queue.offer(new Pair<>(node.right, index * 2 + 1));
            }
            
            maxWidth = Math.max(maxWidth, (int)(last - first + 1));
        }
        
        return maxWidth;
    }
}
public class Q662 {
    
}
