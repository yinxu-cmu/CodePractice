public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = digits.length;
        int carry = 0;
        int result = digits[len-1] + 1;
        if(result > 9){
            carry = 1;
            digits[len-1] = 0;
        }else{
            digits[len-1] = result;
            return digits;
        }
        
        for(int i=len-2; i >= 0; i--){
            int tmp = digits[i] + carry;
            if(tmp > 9){
                carry = 1;
                digits[i] = 0;
            }else{
                carry = 0;
                digits[i] = tmp;
                return digits;
            }
        }
        
        int digitsplus[] = new int[len+1];
        digitsplus[0] = 1;
        for(int j=1; j < digitsplus.length; j++){
            digitsplus[j] = digits[j-1];
        }
        return digitsplus;
    }
}
