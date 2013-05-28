public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        // write an example is really helpful, like: 9,1,2,3,4,5,6,7,8 */
        int end = A.length - 1;
        int start = 0;
        while (start <= end ){
            int middle = (start + end) / 2;
            if( A[middle] == target ){
                return middle;
            }
            
            if(A[middle] > target){
                if(A[middle] > A[end]){
                    /* pivot in the right */
                    if( target < A[start] ){
                        start = middle + 1;
                    }else{
                        end = middle - 1;
                    }
                }else{
                    end = middle - 1;
                }    
                
            }else{
                /* middle < target */
                if(A[middle] > A[end]){
                    /* pivot in the right */
                    start = middle + 1;
                }else{
                    if(target > A[end]){
                        end = middle - 1;
                    }else{
                        start = middle + 1;
                    }
                }
            }
            
        }
        return -1;
    }
}
