public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Character> stack = new Stack<Character>();
        int len = s.length();
        for(int i=0; i < len; i++){
            if( s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }else{
                if(stack.size() == 0){
                    return false;
                }else{
                    if(stack.peek() == revP(s.charAt(i))){
                        stack.pop();
                        continue;
                    }else{
                        return false;
                    }
                }
                
            }
        }
        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public char revP(char p){
        char rev;
        if( p == ']'){
            rev = '[';
        }else if(p == '}'){
            rev = '{';
        }else{
            rev = '(';
        }
        return rev;
    }
}
