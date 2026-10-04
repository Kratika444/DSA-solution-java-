class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();

        int openbrt=0;

        for(char ch: s.toCharArray()){
            if(ch=='('|| ch=='*')
            openbrt++;
            else
            openbrt--;

            if(openbrt<0) return false;
        }

        int closebrt=0;
         for(int i= n-1; i>=0;i--){
            if(s.charAt(i)==')'|| s.charAt(i)=='*')
            closebrt++;
            else
            closebrt--;

            if(closebrt<0) return false;
        }
        return true;

    }
}