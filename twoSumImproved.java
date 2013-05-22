public class Solution {
    public int[] twoSumImproved(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int index[] = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(hm.containsKey(numbers[i])){
                index[0] = hm.get(numbers[i]) + 1;
                index[1] = i + 1;
                break;
            }else{
                hm.put(target - numbers[i], i);
            }
        }
        return index;
    }
}
