class Solution {
    public String reverseStr(String s, int k) {
        char str[]=s.toCharArray();
        int n= str.length;
        for(int i=0; i<n; i+=k*2){
            int left=i;
            int right= Math.min(left+k-1, n-1);

            while(left <right){
                char temp= str[left];
                str[left]= str[right];
                str[right]= temp;
                left++;
                right--;
            }

        }
        return new String(str);
    }
}