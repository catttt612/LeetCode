//Given an array of non-negative integers, you are initially positioned at the f
//irst index of the array. 
//
// Each element in the array represents your maximum jump length at that positio
//n. 
//
// Your goal is to reach the last index in the minimum number of jumps. 
//
// Example: 
//
// 
//Input: [2,3,1,1,4]
//Output: 2
//Explanation: The minimum number of jumps to reach the last index is 2.
//    Jump 1 step from index 0 to 1, then 3 steps to the last index. 
//
// Note: 
//
// You can assume that you can always reach the last index. 
// Related Topics Array Greedy


package com.catttt.leetcode.editor.en;

public class JumpGameIi {
    public static void main(String[] args) {
        Solution solution = new JumpGameIi().new Solution();
        int[] nums = {2, 3, 1};
        System.out.println(solution.jump(nums));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int jump(int[] nums) {
            int times = 0;
            int index = 0;
            while (index < nums.length - 1) {
                if (nums[index] + index >= nums.length - 1) {
                    times++;
                    return times;
                }
                int offset = 0;
                int max = 0;
                for (int i = 1; i <= nums[index]; i++) {
                    if (index + i >= nums.length) continue;
                    int s = nums[index + i] + index + i;
                    if (s >= max) {
                        offset = i;
                        max = s;
                    }
                }
                index += offset;
                times++;
            }
            return times;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}