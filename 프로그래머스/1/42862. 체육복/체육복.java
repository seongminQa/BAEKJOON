import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int result = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌 체육복을 가져온 학생이 도난 당했을 경우
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    ++result;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }
        
        // System.out.println(Arrays.toString(lost));
        // System.out.println(Arrays.toString(reserve));
        
        for(int i=0; i<lost.length; i++) {
            for(int j=0; j<reserve.length; j++) {
                if(reserve[j] == -1) continue;
                if(lost[i] -1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    ++result;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        // System.out.println(Arrays.toString(lost));
        // System.out.println(Arrays.toString(reserve));
        
        return result;
    }
}