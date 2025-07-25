// Check if a String Containing Parentheses is valid

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
            }
                char top = stack.pop();
                if((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        String s = "({})";               // INPUT
        System.out.println(isValid(s));  //  OUTPUT: true
    }
}
