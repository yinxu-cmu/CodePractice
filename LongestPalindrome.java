/**
 *find the longest panlindrome in a string: abeeddddeabe
 */
import java.util.*;

public class LogestPalindrome{

	public static void main(String[] args) {
		String input = "abeeddddeabe";
		int len = input.length();
		int pos = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len/2; i++) {
			if(input.charAt(i) == input.charAt(len-1-i)){
				String pair = Character.toString(input.charAt(i)) 
						+ Character.toString(input.charAt(i));
				//System.out.println(pair);
				sb.insert(pos, pair);
				pos++;
			}else{
				sb.setLength(0);
				pos = 0;
			}
			
		}
		System.out.println(sb);
	}
}