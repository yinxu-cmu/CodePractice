/**
 *one unsorted array is given.Find out the index i and j ,
 *j > i for which a[j] - a[i] is maximum.
 *perform in linear time complexity
 */

public class Test{

	public static void main(String[] args) {
		int input[] = {8,9,2,4};
		int minIndex = 0;
		int minTmp = 0;
		int maxIndex = 0;
		int maxDiff = 0;
		int min = input[0];
		for (int i = 1; i < input.length ; i++) {
			if(input[i] < min){
				min = input[i];
				minTmp = i;
			}else{
				int diff = input[i] - min;
				if(diff > maxDiff){
					maxIndex = i;
					maxDiff = diff;
					minIndex = minTmp; 
				}
			}
		}

		System.out.println(minIndex+" "+maxIndex+" "+maxDiff);
	}
}