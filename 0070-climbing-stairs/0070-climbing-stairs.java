import java.util.*;
class Solution {
    static int[] dp;

    public int climbStairs(int n) {
        dp= new int[n+1];
        Arrays.fill(dp, -1);
        return climb(n);
    }
    public static int climb(int n ){
        if(n==1) return 1;
        if(n==2) return 2;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=climb(n-1)+ climb(n-2);
    }
}