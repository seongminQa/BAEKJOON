import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            for(int j=0; j<commands[i][1] - commands[i][0] + 1; j++) {
                temp[j] = array[commands[i][0]-1+j];
            }
            Arrays.sort(temp);
            result[i] = temp[commands[i][2]-1];
        }
        
        return result;
    }
}