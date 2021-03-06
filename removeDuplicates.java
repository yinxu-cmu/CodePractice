public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* eg. A = {1,1,2} */
        int len = A.length;
        /* boundary check */
        if(len == 0){
            return 0;
        }
        int last = A[0];
        for(int i=1;i<len;i++){
            if(A[i] == last){
                remove(A, i);
                len--;
                /* attention here: i-- */
                i--;
            }else{
                last = A[i];
            }
        }
        return len;
        
    }
    /* in place remove */
    public void remove(int[] a, int index){
        for(int i=index;i < a.length-1; i++){
            /* i + 1, check boundary */
            a[i] = a[i+1];
        } 
    }
}
