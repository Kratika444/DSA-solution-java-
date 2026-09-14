class Solution {
    public int[] asteroidCollision(int[] arr) {
        
        int n =arr.length;

        Stack<Integer> st= new Stack<>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
               st.push(arr[i]);
            }else{
                while(st.size()>0 && st.peek()>0 && st.peek()< Math.abs(arr[i])){
                    st.pop();
                }
                if(st.size()>0 && st.peek()== Math.abs(arr[i])){
                    st.pop();
                }else if(st.isEmpty() || st.peek()<0){
                    st.push(arr[i]);
                }
            }
        }
        int ss= st.size();
        int ans[]= new int[ss];
        while(st.size()>0){
            ans[ss-1]= st.pop();
        ss--;
        }
        return ans;
    }
}