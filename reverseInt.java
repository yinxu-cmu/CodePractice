public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        /* 1. overflow after revers
         * 2. special case: 10, 100
         * 3. how to detect overflow
         */
         
        int res = 0;
        int tmp = x;
        int result = 0;
        
        while(Math.abs(tmp) >= 1){
          /* first res, or first tmp, it matters! */
            res = tmp % 10;
            tmp = tmp / 10;
            result = result * 10 + res;
        }
        return result;
    }
}
