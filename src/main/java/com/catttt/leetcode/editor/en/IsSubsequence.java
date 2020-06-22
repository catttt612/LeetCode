//Given a string s and a string t, check if s is subsequence of t. 
//
// A subsequence of a string is a new string which is formed from the original s
//tring by deleting some (can be none) of the characters without disturbing the re
//lative positions of the remaining characters. (ie, "ace" is a subsequence of "ab
//cde" while "aec" is not). 
//
// Follow up: 
//If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you w
//ant to check one by one to see if T has its subsequence. In this scenario, how w
//ould you change your code? 
//
// Credits: 
//Special thanks to @pbrother for adding this problem and creating all test case
//s. 
//
// 
// Example 1: 
// Input: s = "abc", t = "ahbgdc"
//Output: true
// Example 2: 
// Input: s = "axc", t = "ahbgdc"
//Output: false
// 
// 
// Constraints: 
//
// 
// 0 <= s.length <= 100 
// 0 <= t.length <= 10^4 
// Both strings consists only of lowercase characters. 
// 
// Related Topics Binary Search Dynamic Programming Greedy


package com.catttt.leetcode.editor.en;

public class IsSubsequence {
    public static void main(String[] args) {
        Solution solution = new IsSubsequence().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean isSubsequence(String s, String t) {
            char[] charsOfT = t.toCharArray();
            char[] charsOfS = s.toCharArray();
            int index = 0;
            for (char c : charsOfT) {
                if (index == charsOfS.length) {
                    return true;
                }
                if (c == charsOfS[index]) {
                    index++;
                }
            }
            return index == charsOfS.length;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}