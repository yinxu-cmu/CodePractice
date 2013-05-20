import java.util.Arrays;


public class Test {
  public static void main(String args[]){
		int input[] = {-10,1,-2,3};
		int output[] = BiggestSum(input);
		for(int i=0;i<output.length;i++){
			System.out.println(output[i]);
		}
	}
	
	/* dynamic program */
	public static int[] BiggestSum(int input[]) {
		if(input.length == 0)
			return null;
        int start = 0;
        int end = 0;
        int starttmp = 0;
        int maxsum = input[0];
        int maxtmp = input[0];
        for(int i=1; i<input.length;i++){
          /* temp max */
        	if(maxtmp < 0){
        		maxtmp = input[i];
        		starttmp = i;
        	}else{
        		maxtmp += input[i];
        	}
        	
        	if(maxtmp > maxsum){
        		maxsum = maxtmp;
        		start = starttmp;
        		end = i;
        	}
        }
        return Arrays.copyOfRange(input, start, end+1);
        
    }
}
