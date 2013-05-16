/**
 * Design an algorithm and write code to remove the duplicate characters 
 * in a string without using any additional buffer.
 */
import java.util.*;

public class RemoveDup{

	public static void main(String[] args) {
		String input = "I havee a dream";
		System.out.println(result);
	}

	public static String removeDup(String input){
		String result = "";
		HashSet hs = new HashSet();
		for (int i=0;i < input.length();i++ ) {
			if(hs.contains(input.charAt(i))){

			}else{
				hs.add(input.charAt(i));
				result += input.charAt(i);
			}
		}
		System.out.println(result);
	}
	/**
	 * [removeDup description] no buffer version
	 * @param  input [description]
	 * @return       [description]
	 */
	public static String removeDup1(String input){
		char cArray[] = input.toCharArray();
		int runner;
		int tail = 0;
		for (int i = 0; i < cArray.length; i++) {
			runner = i + 1;
			while(runner < cArray.length){
				if(cArray[i] == cArray[runner]){
					/* dup found */
					break;
				}
				runner++;
			}
			if(runner == cArray.length){
				/* no dup, keep in cArray*/
				cArray[tail++] = cArray[i];
			}
		}
		cArray[tail] = '0';
		return String.valueOf(cArray);
	}
}