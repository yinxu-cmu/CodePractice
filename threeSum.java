public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if( num == null || num.length == 0){
            return result;
        }
        int[] snum = sort(num);
        int len = snum.length;
        HashSet<ArrayList<Integer>> sets = new HashSet<ArrayList<Integer>>();
        / * O(n^2) */
        for(int i = 0; i < len; i++){
            int j = i + 1;
            int k = len - 1;
            while(j < k){
                if(snum[i] + snum[j] + snum[k] < 0 ){
                    j++;
                }else if (snum[i] + snum[j] + snum[k] > 0 ){
                    k--;
                }else{
                    ArrayList<Integer> set = new ArrayList<Integer>();
                    set.add(snum[i]);
                    set.add(snum[j]);
                    set.add(snum[k]);
                    sets.add(set);
                    j++;
                    k--;
                }
            }
        }
        /* HashSet to ArrayList */
        result = new ArrayList<ArrayList<Integer>>(sets);
        return result;
    }
    public int[] sort(int[] num){
        int middle = num.length / 2 ;
        int[] first = null;
        int[] second = null;
        if( middle != 0){
            first = Arrays.copyOfRange(num, 0, middle);
            int[] f = sort(first);
            second = Arrays.copyOfRange(num, middle, num.length);
            int[] s = sort(second);
            return merge(f, s);
        }
        return num;
    }
    
  public int[] merge(int[] n1, int[] n2){
		int i = 0;
		int j = 0;
		int[] result = new int[n1.length + n2.length];
		int pos = 0;
		while(i < n1.length && j < n2.length){
			if( n1[i] < n2[j]){
				result[pos++] = n1[i++];
			}else{
				result[pos++] = n2[j++];
			}
		}
		while(i < n1.length){
			result[pos++] = n1[i++];
		}
		while(j < n2.length){
			result[pos++] = n2[j++];
		}
		return result;
	}
}
