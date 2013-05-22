public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /* O(n^2) */
        int index[] = new int[2];
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j< numbers.length; j++){
                if( numbers[i] + numbers[j] == target ){
                    index[0] = i+1;
                    index[1] = j+1;
                    return index;
                }
            }
        }
        return index;
    }
}
