import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }
    private void dfs(TreeNode node, String path, List<String> res) {
        if (node == null) return;
        if (node.left == null && node.right == null) res.add(path + node.val);
        else {
            dfs(node.left, path + node.val + "->", res);
            dfs(node.right, path + node.val + "->", res);
        }
    }
}

public class Q257 {
    
}
