
public class Test {
  public static void main(String args[]){
		String input = "tattarrattat";
		String output = longestPalindrome(input);
		System.out.println(output);
	}
	
	
	public static String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        char[] cArray = s.toCharArray();
        String palin = "";
        if(cArray.length == 1){
            return s;
        }
        for(int i = 0;i < cArray.length - 1; i++){
            /* i as center */
            String palinT = Character.toString(cArray[i]);
            String palinT1 = "";
            if(cArray[i] == cArray[i+1]){
                palinT1 = Character.toString(cArray[i]) + Character.toString(cArray[i+1]);
            }
            //String palinT1 = 
            boolean flag1 = true;
            boolean flag2 = true;
            for(int j = 1; i-j >= 0 && i+j < cArray.length; j++){
                boolean b1 = (cArray[i-j] == cArray[i+j]) && flag1;
                boolean b2 = (i+1+j < cArray.length && cArray[i-j] == 
                            cArray[i+1+j] && cArray[i] == cArray[i+1]) && flag2;
                
                if(b1){
                    palinT = cArray[i-j] + palinT + cArray[i+j];
                }else{
                	flag1 = false;
                }
                if(b2){
                    palinT1 = cArray[i-j] + palinT1 + cArray[i+j+1];
                }else{
                	flag2 = false;
                }
                if( !b1 && !b2 )
                    break;
                    
            }
            if(palinT.length() >= palin.length()){
                    palin = palinT;
                }
            if(palinT1.length() >= palin.length()){
                palin = palinT1;
            }
            
        }
        return palin;
    }
}
