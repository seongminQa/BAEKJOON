import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) list.add(arr[i+1]);
        }
        
        int[] result = new int[list.size()];
        
        // for(int value : list) {
        //     int i = 0;
        //     result[i] = value;
        //     ++i;
        // }
        
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}