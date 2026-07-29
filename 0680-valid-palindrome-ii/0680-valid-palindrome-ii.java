class Solution {
    public boolean checkPalindrome(String s, int i, int j){
        while(i<j){
        if(s.charAt(i)!= s.charAt(j)){
            return false;
        }
        i++;j--;
        }
        return true;
    } 
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
 
        while(i<j){
            char left= s.charAt(i);
            char right= s.charAt(j);
            if(left != right){
                return checkPalindrome(s, i+1, j)|| checkPalindrome(s, i, j-1);
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}