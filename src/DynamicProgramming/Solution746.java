package DynamicProgramming;

import java.util.Arrays;

/**
 * 746.使用最小花费爬楼梯
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * 请你计算并返回达到楼梯顶部的最低花费。
 * https://leetcode.cn/problems/min-cost-climbing-stairs/
 */

/**
 * 动态规划五部曲
 * 1. 确定dp[i]的含义: dp[i]表示爬到第i级别楼梯的最小花费
 * 2. 确定递归表达式: dp[i] = dp[i-1] + cost[i-1] 或 dp[i] = dp[i-2] + cost[i-2]
 * 3. 初始化: dp[0] = 0, dp[1] = 0
 * 4. 确定遍历顺序: 正序遍历
 * 5. 输出dp[i]
 */

class Solution746 {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <=n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i -2] + cost [i - 2]);
        }
        return dp[n];
    }
}
