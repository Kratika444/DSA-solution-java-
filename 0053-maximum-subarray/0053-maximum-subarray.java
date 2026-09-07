class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int n= nums.length;
        int i=0;
        int sum=0;
        //using the kadane's algorithm
        while(i<n){
         sum+= nums[i];
         maxsum= Math.max(maxsum,sum);
        if(sum<0){
            sum=0;
         }
         i++;
        }
        return maxsum;
    }
}