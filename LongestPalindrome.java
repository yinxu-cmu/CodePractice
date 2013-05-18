/**
 *find the longest panlindrome in a string
 * extremely slow edition.....
 */
import java.util.*;

public class LongestPalindrome{

	
	
	public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        char[] cArray = s.toCharArray();
        int max = 0;
        String palin = "";
        if(cArray.length == 1){
            return s;
        }
        for(int i = 0;i < cArray.length - 1; i++){
            /* i as center */
            String palinT = Character.toString(cArray[i]);
            
                for(int j = 1; i-j >= 0 && i+j < cArray.length; j++){
                    if(cArray[i-j] == cArray[i+j]){
                        palinT = cArray[i-j] + palinT + cArray[i+j];
                    }else{
                        break;
                    }
                    
                }
            if(palinT.length() >= palin.length()){
                    palin = palinT;
                }
                
            if(cArray[i] == cArray[i+1]){
                palinT = Character.toString(cArray[i]) + Character.toString(cArray[i+1]);
                for(int l = 1; i-l >= 0 && i+l+1 < cArray.length;l++){
                    if(cArray[i-l] == cArray[i+l+1]){
                        palinT = cArray[i-l] + palinT + cArray[i+1+l];
                    }else{
                       break;
                    }
                }
                 if(palinT.length() >= palin.length()){
                            palin = palinT;
                    }
            }
            
        }
        return palin;
    }
}
