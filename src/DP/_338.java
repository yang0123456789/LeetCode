package DP;

public class _338 {

    public int[] countBits(int num) {
        int[] dp = new int[num + 1];
        dp[0] = 0;
        for (int i = 1; i <= num; i++) {
            dp[i] = dp[i / 2] + i % 2;
        }

        return dp;
    }
}
