public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length == 0){
            return 0;
        }
        
        int len = A.length;
        for(int i=0;i<len;i++){
            if(A[i] == elem){
                /* rearrange */
                if(len == 1){
                    return 0;
                }
                /* attention, last elem delete */
                for(int j=i; j < len - 1; j++){
                    //if(j < len - 1)
                        A[j] = A[j+1];
                    
                }
                len--;
                i--;
            }
        }
        return len;
    }
}
