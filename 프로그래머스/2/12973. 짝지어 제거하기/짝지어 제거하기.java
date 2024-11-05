import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        
        for(int i=1; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);    
            }
        }
        
        if(stack.size() == 0) result = 1;
        
        return result;
    }
}