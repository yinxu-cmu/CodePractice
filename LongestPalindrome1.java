/**
 *find the longest panlindrome in a string: abeeddddeabe
 */
import java.util.*;

public class LongestPalindrome1{

	public static void main(String[] args) {
		String input = "abeeddddeabe";
		int len = input.length();
		String palin = "";
		for (int i = 0; i < len/2; i++) {
			if(input.charAt(i) == input.charAt(len-1-i)){
				palin += input.charAt(i);
			}else{
				palin = "";
			}
		}
		System.out.println(palin);
		int len1 = palin.length();
		for (int j = len1 - 1; j >= 0; j--) {
			palin += palin.charAt(j);
		}
		System.out.println(palin);
	}
}