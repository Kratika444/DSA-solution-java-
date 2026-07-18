class Solution {
    public int findGCD(int[] nums) {
        int a=0;
        int b=1001;
        for(int num: nums){
            if(num>a)
                a=num;
            if(num<b)
               b= num;
        }
        return gcd(b, a);
       
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}