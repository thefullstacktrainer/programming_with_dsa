package org.excelr.day6.dp;

public class CoinChange {

    public static int countWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There is one way to make change for amount 0 (no coins)

        // Build up the dp array using optimal substructure
        for (int j = 0; j < coins.length; j++) {
            for (int i = coins[j]; i <= amount; i++) {
                dp[i] += dp[i - coins[j]];
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5}; // Coin denominations
        int amount = 8; // Target amount for change

        int ways = countWays(coins, amount);

        System.out.println("Number of ways to make change: " + ways);
    }
}











