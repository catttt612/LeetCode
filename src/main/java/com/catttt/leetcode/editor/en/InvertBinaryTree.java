//Invert a binary tree. 
//
// Example: 
//
// Input: 
//
// 
//     4
//   /   \
//  2     7
// / \   / \
//1   3 6   9 
//
// Output: 
//
// 
//     4
//   /   \
//  7     2
// / \   / \
//9   6 3   1 
//
// Trivia: 
//This problem was inspired by this original tweet by Max Howell: 
//
// Google: 90% of our engineers use the software you wrote (Homebrew), but you c
//an’t invert a binary tree on a whiteboard so f*** off. 
// Related Topics Tree

package com.catttt.leetcode.editor.en;

public class InvertBinaryTree {
    public static void main(String[] args) {
        Solution solution = new InvertBinaryTree().new Solution();
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
        public TreeNode invertTree(TreeNode root) {
            helper(root);
            return root;
        }

        private void helper(TreeNode node) {
            if (node == null) {
                return;
            }
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            helper(node.left);
            helper(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}