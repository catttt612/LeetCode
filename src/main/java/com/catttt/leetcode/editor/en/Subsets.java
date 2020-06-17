//Given a set of distinct integers, nums, return all possible subsets (the power
// set). 
//
// Note: The solution set must not contain duplicate subsets. 
//
// Example: 
//
// 
//Input: nums = [1,2,3]
//Output:
//[
//  [3],
//  [1],
//  [2],
//  [1,2,3],
//  [1,3],
//  [2,3],
//  [1,2],
//  []
//] 
// Related Topics Array Backtracking Bit Manipulation

package com.catttt.leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Solution solution = new Subsets().new Solution();
        List<List<Integer>> list = solution.subsets(new int[]{1, 2, 3});
        System.out.println(list);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            Arrays.sort(nums);
            backtrack(list, new ArrayList<>(), nums, 0);
            return list;
        }

        private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
            list.add(new ArrayList<>(tempList));
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}