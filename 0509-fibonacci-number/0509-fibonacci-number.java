class Solution {
    static int[] dp;
    public int fibbo(int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans= fibbo(n-1)+ fibbo(n-2);
        dp[n]= ans;
        return ans;
        
    }
    public int fib(int n) {
        dp= new int[n+1];
        return fibbo(n);
    }
}