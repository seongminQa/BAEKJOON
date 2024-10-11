import java.util.*;

class Solution {
    public Integer[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int max = 0;
        int[] score = new int[3];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++) {
            if(a[i % a.length] == answers[i]) score[0]++;
            if (b[i % b.length] == answers[i]) score[1]++;
            if (c[i % c.length] == answers[i]) score[2]++;
        }
        
        for(int i : score) {
            if(i >= max) max = i;
        }
        
        int cnt = 1;
        for(int i : score) {
            if(i >= max) {
                list.add(cnt);
            }
            ++cnt;
        }
        
        Integer[] array = list.toArray(new Integer[0]);
        
        return array;
    }
}