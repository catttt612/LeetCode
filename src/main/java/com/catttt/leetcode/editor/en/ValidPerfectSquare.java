//Given a positive integer num, write a function which returns True if num is a 
//perfect square else False. 
//
// Follow up: Do not use any built-in library function such as sqrt. 
//
// 
// Example 1: 
// Input: num = 16
//Output: true
// Example 2: 
// Input: num = 14
//Output: false
// 
// 
// Constraints: 
//
// 
// 1 <= num <= 2^31 - 1 
// 
// Related Topics Math Binary Search

package com.catttt.leetcode.editor.en;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        Solution solution = new ValidPerfectSquare().new Solution();
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            boolean perfectSquare = solution.isPerfectSquare(i);
//            if (perfectSquare) {
//                System.out.println(i);
//            }
//        }
        System.out.println(solution.isPerfectSquare(2147483647));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        // if you use int type, it will time out
        public boolean isPerfectSquare(int num) {
            long left = 1;
            long right = num;
            while (left <= right) {
                long mid = (right - left) / 2 + left;
                if (mid * mid == num) {
                    return true;
                } else if (mid * mid > num) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}