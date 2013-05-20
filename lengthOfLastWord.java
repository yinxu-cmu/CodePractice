public class Solution {
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* Hello World */
        int len = s.length();
        if(len == 0){
            return 0;
        }
        
        
        int i = len - 1;
        int space = 0;
        /* find last none space */
        /* attention: use 'space' track num of spaces */
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
            space++;
        }
        
        int j = i;
        while(j >= 0 && s.charAt(j) != ' ' ){
            j--;
        }
        if(i == -1){
            return 0;
        }
        else if(j == -1){
        /* consider space when calculate */
            return len - space;
        }else{
            return len - j -space - 1;
        }
    }
}
