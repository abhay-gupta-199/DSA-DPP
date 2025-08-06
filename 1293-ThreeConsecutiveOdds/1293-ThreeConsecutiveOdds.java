// Last updated: 8/6/2025, 11:02:43 AM
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n < 3) {
            return false;
        }
        for(int i = 0; i < n - 2; i++) {
            if(arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}