
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] r=new int[n],l=new int[n];
        compute(l,r,prices);
        int ans=l[n-1];
        for(int i=0;i<n-1;i++) ans=Math.max(l[i]+r[i+1],ans);
        return ans;
    }
    public void compute(int[] l,int[] r,int[] prices){
        TreeSet<Integer> ts=new TreeSet<>();
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(!ts.isEmpty()) l[i]=Math.max(Math.max(i-1>=0?l[i-1]:0,l[i]),prices[i]-ts.getFirst());
            ts.add(prices[i]);
        }
        ts.clear();
        for(int i=n-1;i>=0;i--){
            if(!ts.isEmpty()) r[i]=Math.max(Math.max(r[i],i+1<=n-1?r[i+1]:0),ts.getLast()-prices[i]);
            ts.add(prices[i]);
        }
    }
}