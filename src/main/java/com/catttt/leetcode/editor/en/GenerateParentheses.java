//
//Given n pairs of parentheses, write a function to generate all combinations of
// well-formed parentheses.
// 
//
// 
//For example, given n = 3, a solution set is:
// 
// 
//[
//  "((()))",
//  "(()())",
//  "(())()",
//  "()(())",
//  "()()()"
//]
// Related Topics String Backtracking

package com.catttt.leetcode.editor.en;

import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
        List<String> result = solution.generateParenthesis(3);
        System.out.println(result);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        private List<String> result;

        public List<String> generateParenthesis(int n) {
            result = new LinkedList<>();
            generate(0, 0, n, "");
            return result;
        }

        private void generate(int left, int right, int max, String s) {
            if (left == max && right == max) {
                result.add(s);
                return;
            }

            if (left < max) {
                generate(left + 1, right, max, s + "(");
            }
            if (left > right) {
                generate(left, right + 1, max, s + ")");
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}