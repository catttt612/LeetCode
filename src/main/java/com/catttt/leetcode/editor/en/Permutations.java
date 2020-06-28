//Given a collection of distinct integers, return all possible permutations. 
//
// Example: 
//
// 
//Input: [1,2,3]
//Output:
//[
//  [1,2,3],
//  [1,3,2],
//  [2,1,3],
//  [2,3,1],
//  [3,1,2],
//  [3,2,1]
//]
// 
// Related Topics Backtracking


package com.catttt.leetcode.editor.en;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        Solution solution = new Permutations().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtracking(result, new ArrayList<>(), nums);
            return result;
        }

        private void backtracking(List<List<Integer>> result, List<Integer> tmp, int[] arr) {
            if (tmp.size() == arr.length)
                result.add(new ArrayList<>(tmp));
            else {
                for (int i = 0; i < arr.length; i++) {
                    if (tmp.contains(arr[i])) continue;
                    tmp.add(arr[i]);
                    backtracking(result, tmp, arr);
                    tmp.remove(tmp.size() - 1);
                }
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}