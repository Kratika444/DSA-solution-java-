class Solution {
    public  int fun(int arr[], int hourly){
        int totalhour =0;
        int n =arr.length;
        for(int i=0;i<n;i++){
            totalhour+= Math.ceil((double)arr[i]/(double)hourly);
        }
        return totalhour;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int low=0;
        int max=Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0;i<n;i++){
                max= Math.max(max, arr[i]);
        }
        int high=max;
        int ans=0;
        while(low<=high){
            int mid= (low+high)/2;
            int totalhour= fun(arr, mid);
            if(totalhour<=h){
             
                high= mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}