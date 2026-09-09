class Solution {
    public int longestValidParentheses(String s) {
        
        Stack<Integer> st= new Stack<>();
        st.push(-1); // act as a base index
        int count=0;
        
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='('|| ch=='{' || ch=='['){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    count= Math.max(count, i-st.peek());
                }
            }
        }
        return count;

    }

    //   static boolean ss(char a, char b)
    // {
    //     if( a=='('&& b==')') return true;
    //     if( a=='{'&& b=='}') return true;
    //     if( a=='['&& b==']') return true;

    //     return false;
    // }
}