import java.util.*;
class Solution {
    public int sortableIntegers(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        int sum = 0;
        for (int k = 1; k * k <= n; k++) {
            if (n % k != 0) continue;
            if (isValid(arr, sorted, k)) sum += k;
            if (k != n / k && isValid(arr, sorted, n / k)) {
                sum += (n / k);
            }
        }
        return sum;
    }
    private boolean isValid(int[] arr, int[] sorted, int k) {
        int n = arr.length;
        for (int start = 0; start < n; start += k) {
            int[] a = Arrays.copyOfRange(arr, start, start + k);
            int[] b = Arrays.copyOfRange(sorted, start, start + k);    
            if (!isRotation(a, b)) return false;
        }
        return true;
    }
    private boolean isRotation(int[] a, int[] b) {
        int k = a.length;
        int[] bb = new int[2 * k];
        for (int i = 0; i < k; i++) {
            bb[i] = b[i];
            bb[i + k] = b[i];
        }
        for (int start = 0; start < k; start++) {
            boolean match = true;
            for (int i = 0; i < k; i++) {
                if (bb[start + i] != a[i]) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }
        return false;
    }
}