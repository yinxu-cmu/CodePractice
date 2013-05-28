public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        /** RECURSION *******/
        if(num == null){
            return null;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if( num.length == 1){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(num[0]);
            result.add(list);
            return result;
        }
        /* TWO POINTERS TO COPY SUB_ARRAY */
        for( int i = 0; i < num.length; i++){
            int[] sub = new int[num.length - 1];
            int l = 0;
            int m = 0;
            while(l < num.length -1){
                if( l == i ){
                    m++;
                } 
                sub[l++] = num[m++];
            }
            ArrayList<ArrayList<Integer>> tmp = permute(sub);
            for( int j = 0; j < tmp.size();j++){
                /* CONCATENATE ARRAY LIST */
                tmp.get(j).add(num[i]);
                result.add(tmp.get(j));
            }
        }
        return result;
    }
}
