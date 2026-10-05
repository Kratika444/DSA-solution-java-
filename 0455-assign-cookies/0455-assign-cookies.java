class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n= g.length;
        int m = s.length;

        int left=0; // cookie size array 
        int right=0;// for greed array 
        Arrays.sort(g); // O(log n)
        Arrays.sort(s);// O(log m)
        while(left <m & right< n){   //O(m)
            if(g[right] <= s[left]){
               right++;
            }
           left++;
        }
        return right;
    }
}