import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[score.length];
        
        for(int i=0; i<score.length; i++) {
            if(i < k) {
                list.add(score[i]);
                Collections.sort(list);
                result[i] = list.get(0);
            } else {
                list.add(score[i]);
                Collections.sort(list, Collections.reverseOrder());
                result[i] = list.get(k-1);
            }
        }
        
        return result;
    }
}