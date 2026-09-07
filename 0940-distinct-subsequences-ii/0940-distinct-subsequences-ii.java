class Solution {
    int MOD = 1000000007;
    public int distinctSubseqII(String s) {
        int newstr = 0;
        int[] dp = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 97;
            int add = (newstr - dp[c] + MOD) % MOD;

            dp[c] = 1 + newstr;
            newstr = (dp[c] + add) % MOD;
        }
        return newstr;
    }
}