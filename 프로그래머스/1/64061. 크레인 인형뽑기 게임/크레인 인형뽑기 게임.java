import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<moves.length; i++) {
            int temp = moves[i]-1;
            for(int j=0; j<board.length; j++) {
                if(board[j][temp] != 0) {
                    stack.push(board[j][temp]);
                    board[j][temp] = 0;
                    break;
                }
            }
            
            // System.out.println(stack);
            
            if(stack.size() >= 2) {
                int size = stack.size();
                if(stack.get(size-2) == stack.get(size-1)) {
                    result += 2;
                    stack.pop();
                    stack.pop();
                }
            }
        }
        
        return result;
    }
}