//Given a binary tree, return the postorder traversal of its nodes' values. 
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
//Output: [3,2,1]
// 
//
// Follow up: Recursive solution is trivial, could you do it iteratively? 
// Related Topics Stack Tree

package com.catttt.leetcode.editor.en;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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
        public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> result = new LinkedList<>();
            traversal(result, root);
            return result;
        }

        private void traversal(List<Integer> result, TreeNode node) {
            if (node == null) {
                return;
            }
            traversal(result, node.left);
            traversal(result, node.right);
            result.add(node.val);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}