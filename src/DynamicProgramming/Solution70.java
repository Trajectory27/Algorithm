package DynamicProgramming;
/**
 * 70.爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * https://leetcode.cn/problems/climbing-stairs/
 */

/**
 * 动态规划五步
 * 1. 确定dp[i]的含义: dp[i]是i级台阶可以走的方法数
 * 2. 确定递推公式: dp[i] = dp[i-1] + dp[i-2]
 * 3. dp数组如何初始化: dp[0] = 0, dp[1] = 1
 * 4. 遍历顺序: 正向遍历
 * 5. 打印dp数组
 */
class Solution70 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
