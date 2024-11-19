import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int result = 0;
        
        Map<Integer, Integer> rightMap = new HashMap<>();
        for(int top : topping) {
            rightMap.put(top, rightMap.getOrDefault(top, 0) + 1);
        }
        
        Map<Integer, Integer> leftMap = new HashMap<>();
        
        for(int top : topping) {
            leftMap.put(top, leftMap.getOrDefault(top, 0) + 1);
            
            rightMap.put(top, rightMap.get(top)-1);
            if(rightMap.get(top) == 0) {
                rightMap.remove(top);
            }
            
            if(leftMap.size() == rightMap.size()) {
                ++result;
            }
        }
        
        return result;
    }
}