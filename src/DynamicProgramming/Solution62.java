package DynamicProgramming;
/**
 * 62.不同路径
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
 * 问总共有多少条不同的路径？
 * https://leetcode.cn/problems/unique-paths/
 */

/**
 * 动态规划五部曲
 * 1. dp[i][j] 是机器人从(0,0)走到(i,j)的路径数量
 * 2. dp[i][j] = dp[i-1][j] + dp[i][j-1]
 * 3. dp[0][j] = 0, dp[i][0] = 0
 * 4. 正序遍历
 * 5. 打印dp[i][j]
 */
class Solution62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];

    }
}
