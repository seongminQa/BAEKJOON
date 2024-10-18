import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int result = 0;
        // 빵1 -> 야채2 -> 고기3 -> 빵1
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<ingredient.length; i++) {
            stack.push(ingredient[i]);
            // System.out.println(stack);
            if(stack.size() < 4) continue;
            
            int size = stack.size();
            
            if(stack.get(size-4) == 1 && stack.get(size-3) == 2
                && stack.get(size-2) == 3 && stack.get(size-1) == 1) {
                ++result;
                
                for(int j=0; j<4; j++) {
                    stack.pop();
                }
            }
        }
        
        return result;
    }
}