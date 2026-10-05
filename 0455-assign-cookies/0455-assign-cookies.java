class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n= g.length;
        int m = s.length;

        int left=0; // cookie size array 
        int right=0;// for greed array 
        Arrays.sort(g);
        Arrays.sort(s);
        while(left <m & right< n){
            if(g[right] <= s[left]){
               right++;
            }
           left++;
        }
        return right;
    }
}