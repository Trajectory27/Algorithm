package DynamicProgramming;
/**
 * 509.斐波那契数
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给定 n ，请计算 F(n) 。
 * https://leetcode.cn/problems/fibonacci-number/
 */

/**
 * 动态规划五步：
 * 1. 确定dp[i]的含义: dp[i]是斐波那契数组的第i个元素
 * 2. 递推公式: dp[i] = dp[i-1] + dp[i-2]
 * 3. dp数组如何初始化: dp[0] = 0, dp[1] = 1
 * 4. 遍历顺序: 正向遍历
 * 5. 打印dp数组
 * 0 1 1 2 3 5 8 13...
 * 0 1 2 3 4 5 6 7
 * 1 2 3 4 5 6 7 8
 */
public class Solution509 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
