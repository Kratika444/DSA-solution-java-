class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length()) return false;
        
         char ch[]= s.toCharArray();

         HashMap<Character, Integer> map= new HashMap<>();
        //  HashMap<Character, Integer> t_map= new HashMap<>();
         for(char ele: ch){
            if(map.containsKey(ele)){
                int freq= map.get(ele);
                map.put(ele, freq+1);
            }
            else{
                map.put(ele, 1);
            }
         }

         for(int i=0;i<t.length(); i++){
            char c= t.charAt(i);
            if(!map.containsKey(c)||map.get(c)==0)
            return false;

            map.put(c, map.get(c)-1);
         }
         return true;
    }
}