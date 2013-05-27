public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int lenN = needle.length();
        int lenH = haystack.length();
        String result = null;
        int len = 0;
        if( lenN == 0 && lenH == 0 ){
            return "";
        }
        
        if( lenN ==0 && lenH != 0 ){
            return haystack;
        }
        
        if( lenN > lenH ){
            return null;
        }
        
        char n1 = needle.charAt(0);
        int i;
        for( i = 0;i < lenH - lenN + 1 ;i++ ){
            if( haystack.charAt(i) == n1 ){
                len++;
                /* check following char */
                int runnerH = i+1;
                for(int runnerN = 1; runnerN < lenN ; runnerN++){
                    if( needle.charAt(runnerN) == haystack.charAt(runnerH)){
                        runnerH++;
                        len++;
                        if ( len == lenN ) {
                            return haystack.substring(i, lenH);
                        }
                    }else{
                        len = 0;
                        break;
                    }
                }
            }
            /* attention! deal with input like "aaa", "a" */
            if(len != 0 ){
                return haystack.substring(i, lenH);
            }
        }
        /* non exist */
        return null;
    }
}
