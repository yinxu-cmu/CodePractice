public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* reverse the input and compare with itself */
        int res = x;
        int tmp = x;
      int rev = 0;
    	while(tmp >= 1){
    		res = tmp % 10;
    		tmp = tmp / 10;
    		rev = rev * 10 + res; 
    	}
    	//rev = rev*10 + res;
    	return x == rev;
    }
}
