import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        int len = score.length;
        Integer[] temp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        Arrays.sort(temp, Collections.reverseOrder());

        for(int i=0; i<len/m; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0+(m*i); j<m+(m*i); j++) {
                if(temp[j] < min) min = temp[j];
            }
            result += 1*min*m;
        }
        
        return result;
    }
}