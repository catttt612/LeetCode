//Given a binary tree, return all root-to-leaf paths. 
//
// Note: A leaf is a node with no children. 
//
// Example: 
//
// 
//Input:
//
//   1
// /   \
//2     3
// \
//  5
//
//Output: ["1->2->5", "1->3"]
//
//Explanation: All root-to-leaf paths are: 1->2->5, 1->3
// Related Topics Tree Depth-first Search

package com.catttt.leetcode.editor.en;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePaths().new Solution();
    }
//leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> result = new LinkedList<>();
            StringBuilder path = new StringBuilder();
            helper(result, path, root);
            return result;
        }

        private void helper(List<String> result, StringBuilder path, TreeNode node) {
            if (node == null) return;
            int length = path.length();
            path.append(node.val);
            if (node.left == null && node.right == null) {
                result.add(path.toString());
            } else {
                path.append("->");
                helper(result, path, node.right);
                helper(result, path, node.left);
            }
            path.setLength(length);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}