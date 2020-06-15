//Given a binary tree, return the preorder traversal of its nodes' values. 
//
// Example: 
//
// 
//Input: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//Output: [1,2,3]
// 
//
// Follow up: Recursive solution is trivial, could you do it iteratively? 
// Related Topics Stack Tree

package com.catttt.leetcode.editor.en;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePreorderTraversal().new Solution();
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result = new LinkedList<>();
            traversal(result, root);
            return result;
        }

        private void traversal(List<Integer> result, TreeNode node) {
            if (node == null) {
                return;
            }
            result.add(node.val);
            traversal(result, node.left);
            traversal(result, node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}