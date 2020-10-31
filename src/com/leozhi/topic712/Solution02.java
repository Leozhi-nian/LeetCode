package com.leozhi.topic712;

/**
 * @author leozhi
 * 动态规划 自底而上
 * 通过
 * 30ms
 *
 * 示例 "delete" "leet"
 * i0 0 108 209 310 426
 *
 * i1 100 208 309 410 526
 *
 * i2 201 309 208 309 425
 *
 * i3 309 201 302 403 519
 *
 * i4 410 302 201 302 418
 *
 * i5 526 418 317 418 302
 *
 * i6 627 519 418 317 403
 */
public class Solution02 {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length(), n = s2.length(), res = 0;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][0] = s1.charAt(i - 1) + dp[i - 1][0];
            for (int j = 1; j <= n; j++) {
                dp[0][j] = s2.charAt(j - 1) + dp[0][j - 1];
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(s1.charAt(i - 1) + dp[i - 1][j], s2.charAt(j - 1) + dp[i][j - 1]);
                }
            }
        }
        print(dp);
        return dp[m][n];
    }

    /**
     * 自定义输出方法
     */
    private void print(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print("i" + i + " ");
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}
