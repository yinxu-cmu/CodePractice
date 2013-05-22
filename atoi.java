public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /***** ATTENTION : OVERFLOW!!!
        if(str == null || str.length() == 0){
            return 0;
        }
        boolean flag = true;
        int sign = 1;
        int result = 0;
        for(int i=0; i < str.length(); i++){
            // string that starts with space 
            if( str.charAt(i) == ' ' && flag){
                continue;
            }
            if( str.charAt(i) == '-' && flag){
                flag = false;
                sign = -1;
                continue;
            }
            if( str.charAt(i) == '+' && flag){
                flag = false;
                sign = 1;
                continue;
            }
            
            int tmp = str.charAt(i);
            if( tmp >= 48 && tmp <= 57 ){
                flag = false;
                if( result == Integer.MAX_VALUE / 10 && tmp > 55 || result > Integer.MAX_VALUE / 10){
                    //overflow
                    /*if(sign == 1){
                        return Integer.MAX_VALUE;
                    }else{
                        return Integer.MIN_VALUE;
                    }*/
                    return (sign > 0)? Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                result = result * 10 + (tmp - 48);
                
            }else{
                break;
            }
        }
        
        return result * sign;
            
    }
}
