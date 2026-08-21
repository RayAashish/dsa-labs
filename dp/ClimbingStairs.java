import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClimbingStairs {

    // Brute Force Solution
    static int solve(int n){
        if (n <= 2)
            return n;
        return solve(n - 1) + solve(n - 2);
    }

    // Better Solution (using 1D DP array or Memoization)
    static int solveMemo(int n, int[] dp){
        if (n <= 2)
            return n;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = solveMemo(n - 1, dp) + solveMemo(n - 2, dp);
    }

    static int solveTab(int n){
        int prev2 = 1, prev = 2;
        int result = 0;
        for (int i = 3; i <= n; i++){
            result = prev2 + prev;
            prev2 = prev;
            prev = result;
        }
        return result;
    }
    public static void main(String[] args) throws Exception{
        int n = 20;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(solve(n));
        System.out.println(solveMemo(n, dp));
        System.out.println(solveTab(n));
    }
}
