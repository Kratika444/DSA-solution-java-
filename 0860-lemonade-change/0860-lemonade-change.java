class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int fives=0;
        int tens=0;
        // int twenties=0;
        for(int i=0;i<n;i++){
            if(bills[i]== 5){
                fives += 1;
            } 
            else if(bills[i]==10){
                if(fives>0){
                    fives -=1;
                    tens+=1;
                }else{
                    return false;
                } 
            }
            else{
                if(tens>0 && fives>0){  // here greedy is used as we are first giving 10 and 5 for 20 bill chnage . and saving fives for later use .
                    fives-=1;
                    tens-=1;
                }else if(fives>=3){ // if we dont have tens and have 3 fives so chnage 15 is for 20 bill.
                    fives-=3; 
                }else{
                    return false;
                }
               
            }
        }
        return true;
    }
}