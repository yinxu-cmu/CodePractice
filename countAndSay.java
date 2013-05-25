public class Solution {
    public String countAndSay(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if( n == 0){
            return null;
        }
        
        String pre = "1";
        String next = "";
        for (int i = 1; i < n; i++){
            char cur = pre.charAt(0);
            int count = 0;
            for ( int j = 0; j < pre.length(); j++){
                if( pre.charAt(j) == cur ){
                    count++;
                }else{
                /* encountered diff char, add previous, start next count */
                    next = next + count + Character.toString(cur);
                    cur = pre.charAt(j);
                    count = 1;
                }
            }
            /* dealt with last digit */
            next = next + count + Character.toString(cur);
            pre = next;
            next = "";
        }
        return pre;
    }
}
