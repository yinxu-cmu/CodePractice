public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* binary search */
        
        if( A == null){
            return -1;
        }
        
        int low = 0;
        int high = A.length - 1;
        int middle = 0;
        while(low <= high){
            middle = (high + low) / 2;
            if(A[middle] == target){
                break;
            }
            if(A[middle] > target){
                high = middle - 1;
            }
            if(A[middle] < target){
                low = middle + 1;
            }
        }
        
        return (A[middle] >= target) ? middle : middle+1;
    }
}
