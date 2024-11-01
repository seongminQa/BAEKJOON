import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        if(s.charAt(0) == ')') return false;
        
        stack.push(s.charAt(0));
        
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }

        }

        return stack.isEmpty();
    }
}