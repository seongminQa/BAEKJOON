import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[numbers.length];
        
        for(int i=numbers.length-1; i>=0; i--) {
            // System.out.println(stack);
            while(!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(numbers[i]); // 5 3 3 2
        }
        
        return result;
    }
}