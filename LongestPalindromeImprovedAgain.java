public class LongestPalindrome {
    
	public static void main(String[] args) {
		String input = "baba";
		String output = longestPalindrome(input);
		System.out.println(output);
	}
    public static String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = s.length();
        String palin = "";
        int maxlen = 0;
        int start = 0;
        int end = 0;
        /* length <= 1 */
        if(len <= 1){
            return s;
        }
        
        for(int i=0; i < len-1; i++){
            /* i as center */
            start = i;
            end = i;
            while(start >= 0 && end < len){
                if(s.charAt(start) == s.charAt(end)){
                    start--;
                    end++;
                }else{
                    break;
                }
            }
            start++;
            //end--;
            if(end - start + 1> maxlen){
                maxlen = end - start + 1;
                palin = s.substring(start, end);
            }
            /* i, i+1 as center */
            start = i;
            end = i+1;
            while(start >= 0 && end < len){
                if(s.charAt(start) == s.charAt(end)){
                    start--;
                    end++;
                }else{
                    break;
                }
            }
            start++;
            //end--;
            if(end - start + 1 > maxlen){
                maxlen = end - start + 1;
                palin = s.substring(start, end);
            }
        }
        return palin;
    }
}
