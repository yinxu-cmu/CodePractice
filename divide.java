public class Solution {
  /***** SO SB !!!!! ***************/
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (divisor == 1)
            return dividend;
        if (divisor == dividend)
            return 1;
        int sign = -1; 
        if (dividend > 0 && divisor > 0 
            || (dividend < 0 && divisor < 0 ))
            sign = 1;
        /* use long type deal with overflow */
        long div = dividend > 0 ? dividend: -dividend;
        if (dividend == Integer.MIN_VALUE){
            div = (long)Integer.MAX_VALUE + 1;
        }
        
        long dis = divisor > 0 ? divisor: -divisor;
        if (divisor == Integer.MIN_VALUE){
            dis = (long)Integer.MAX_VALUE + 1;
        }
        
        /* keep moving divisor left, until reach the nearest to dividend */
        long remain = div;
        int result = 0;
        
        while( remain >= dis ){
            int offset = 0;
            while( (dis << offset) <= remain ){
                offset++;
            }
            offset--;
            result += 1 << offset;
            remain = remain - (dis << offset);
        }
        return result * sign;
    }
}
