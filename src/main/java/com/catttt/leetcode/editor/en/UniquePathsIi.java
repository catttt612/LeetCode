//A robot is located at the top-left corner of a m x n grid (marked 'Start' in t
//he diagram below). 
//
// The robot can only move either down or right at any point in time. The robot 
//is trying to reach the bottom-right corner of the grid (marked 'Finish' in the d
//iagram below). 
//
// Now consider if some obstacles are added to the grids. How many unique paths 
//would there be? 
//
// 
//
// An obstacle and empty space is marked as 1 and 0 respectively in the grid. 
//
// Note: m and n will be at most 100. 
//
// Example 1: 
//
// 
//Input:
//[
//  [0,0,0],
//  [0,1,0],
//  [0,0,0]
//]
//Output: 2
//Explanation:
//There is one obstacle in the middle of the 3x3 grid above.
//There are two ways to reach the bottom-right corner:
//1. Right -> Right -> Down -> Down
//2. Down -> Down -> Right -> Right
// 
// Related Topics Array Dynamic Programming


package com.catttt.leetcode.editor.en;

public class UniquePathsIi {
    public static void main(String[] args) {
        Solution solution = new UniquePathsIi().new Solution();
        int[][] arr = {{1, 0}};
        System.out.println(solution.uniquePathsWithObstacles(arr));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int width = obstacleGrid[0].length;
            int[] dp = new int[width];
            dp[0] = 1;
            for (int[] row : obstacleGrid) {
                for (int j = 0; j < width; j++) {
                    if (row[j] == 1)
                        dp[j] = 0;
                    else if (j > 0)
                        dp[j] += dp[j - 1];
                }
            }
            return dp[width - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}