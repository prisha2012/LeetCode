/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        markParents(root, parent);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.add(target);
        visited.add(target);
        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (distance == k) break;

            distance++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null && !visited.contains(node.left)) {
                    visited.add(node.left);
                    queue.add(node.left);
                }

                if (node.right != null && !visited.contains(node.right)) {
                    visited.add(node.right);
                    queue.add(node.right);
                }

                if (parent.get(node) != null && !visited.contains(parent.get(node))) {
                    visited.add(parent.get(node));
                    queue.add(parent.get(node));
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }

        return result;
    }

    private void markParents(TreeNode root, Map<TreeNode, TreeNode> parent) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                parent.put(node.left, node);
                queue.add(node.left);
            }

            if (node.right != null) {
                parent.put(node.right, node);
                queue.add(node.right);
            }
        }
    }
}

public class Q863 {
    
}
