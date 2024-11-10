import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[commands.length];
        
        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int idx = commands[i][2]-1;
            for(int j=start; j<=end; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            result[i] = list.get(idx);
            list.clear();
        }
        
        return result;
    }
}