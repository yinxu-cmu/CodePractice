/**
 * Design an algorithm and write code to remove the duplicate characters 
 * in a string without using any additional buffer.
 */
import java.util.*;

public class RemoveDup{

	public static void main(String[] args) {
		String input = "I havee a dream";
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
}