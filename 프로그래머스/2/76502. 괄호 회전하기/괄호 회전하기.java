import java.util.*;

class Solution {
    public int solution(String s) {
        int result = 0;
        int len = s.length();
        String[] temp = new String[len];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<len; i++) {
            for(int j=i; j<len+i; j++) {
                sb.append(s.charAt(j%len));
            }
            temp[i] = sb.toString();
            sb.setLength(0);
        }
        
        // 잘 들어갔는지 확인
        // for(String st : temp) {
        //     System.out.println(st);
        // }
        
        Stack<Character> stack = new Stack<>();
        
        // 올바른 괄호인지 확인하기
        for(String str : temp) {
            for(int i=0; i<str.length(); i++) {
                char c = str.charAt(i);
                
                if(stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if(c == ']' && stack.peek() == '[' 
                      || c == ')' && stack.peek() == '(' 
                      || c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            
            if(stack.size() == 0) {
                ++result;
            }
            stack.clear();
        }
        
        return result;
    }
}