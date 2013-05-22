public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs == null){
            return null;
        }
        
        if(strs.length == 0){
            return "";
        }
        
        if(strs.length == 1){
            return strs[0];
        }
        /* find the shortest string first, otherwise unnecessary comparison existed*/
        String sh = strs[0];
        for(int m = 0; m < strs.length; m++){
            if(strs[m].length() < sh.length()){
                sh = strs[m];
            }
        }
        
        //String t = strs[0];
        int pos = 0;
        for(int i = 0; i < sh.length() && pos < sh.length(); i++){
            char base = sh.charAt(i);
            for(int j = 0; j < strs.length; j++){
                if(strs[j].length() <= i){
                    return sh.substring(0,pos);
                }else{
                    if( base != strs[j].charAt(i)){
                        return sh.substring(0,pos);
                    }else{
                        continue;
                    }
                }
            }
            //prefix += Character.toString(base);
            pos++;
        }
        return sh.substring(0,pos);
    }
}
