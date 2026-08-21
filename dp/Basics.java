import java.util.Arrays;
class Bascis{

    static int solve(int n, int[] dp){
        if (n <= 1)
            return n;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = solve(n - 1, dp) + solve(n - 2, dp);
    }
    public static void main(String[] args) {
        int n = 10; // 0 1 1 2 3 5 8 13 21 34 55 <-10th pos starting from 0th pos
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n, dp));
    }
}