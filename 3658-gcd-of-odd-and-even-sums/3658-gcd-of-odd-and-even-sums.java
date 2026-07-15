class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum =0;
        int osum=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                esum+=i;
            }else{
                osum+=i;
            }
        }
        return gcd(osum, esum);
    }
    public static int gcd(int a , int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}