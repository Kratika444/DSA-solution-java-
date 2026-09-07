class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(arr.length<3) return false;
        int start= 0;
        int end= n-1;
        // while(start<= end){
        //     int mid= start+(end-start)/2;
        //     if( arr[mid]>arr[mid+1]&& arr[mid]>arr[mid-1]) return true;  // throws index put of bounds as we are calculating mid+1 index;
        //     else if(arr[mid+1]>arr[mid]) start= mid+1;
        //     else end= mid-1;
        // }
        // return false;
        int left= 0;
        int right= n-1;
        while(left+1 < n-1 && arr[left]<arr[left+1]){ // will reach the peak element+1 index pount 
            left++;
        }
        while(right-1>0 && arr[right]<arr[right-1]){
            right--;
        }
        return left== right;
    }
}