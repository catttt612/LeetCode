//Given an array where elements are sorted in ascending order, convert it to a h
//eight balanced BST. 
//
// For this problem, a height-balanced binary tree is defined as a binary tree i
//n which the depth of the two subtrees of every node never differ by more than 1.
// 
//
// Example: 
//
// 
//Given the sorted array: [-10,-3,0,5,9],
//
//One possible answer is: [0,-3,9,-10,null,5], which represents the following he
//ight balanced BST:
//
//      0
//     / \
//   -3   9
//   /   /
// -10  5
// 
// Related Topics Tree Depth-first Search

package com.catttt.leetcode.editor.en;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        Solution solution = new ConvertSortedArrayToBinarySearchTree().new Solution();
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
        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }
            return helper(nums, 0, nums.length - 1);
        }

        private TreeNode helper(int[] nums, int left, int right) {
            if (left > right) return null;
            int mid = (right - left) / 2 + left;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = helper(nums, left, mid - 1);
            node.right = helper(nums, mid + 1, right);
            return node;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}