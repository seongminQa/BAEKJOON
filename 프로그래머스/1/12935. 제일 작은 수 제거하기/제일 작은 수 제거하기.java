import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        
        System.out.println(min);
        
        int[] answer = new int[arr.length-1];
        int index = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != min) {
                answer[index] = arr[i];
                ++index;
            }
        }
        
        return answer;
    }
}