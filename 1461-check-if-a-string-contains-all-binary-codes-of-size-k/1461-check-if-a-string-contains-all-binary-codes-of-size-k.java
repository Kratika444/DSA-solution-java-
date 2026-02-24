import java.util.*;

class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        int n = s.length();
        
        // total possible binary codes of length k
        int total = 1 << k;
        
        // if string too short, impossible
        if (n < k || n - k + 1 < total) return false;
        
        boolean[] seen = new boolean[total];
        int count = 0;
        
        int window = 0;
        int mask = total - 1;
        
        for (int i = 0; i < n; i++) {
            
            // shift left and add new bit
            window = ((window << 1) & mask) | (s.charAt(i) - '0');
            
            if (i >= k - 1) {
                if (!seen[window]) {
                    seen[window] = true;
                    count++;
                    
                    if (count == total) return true;
                }
            }
        }
        
        return false;
    }
}