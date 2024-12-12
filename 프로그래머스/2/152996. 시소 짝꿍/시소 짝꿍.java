import java.util.*;

class Solution {
    public long solution(int[] weights) {
        long result = 0;
        HashMap<Double, Integer> map = new HashMap<>();
        
        for(int weight : weights) {
            double[] ratios = {
                weight * 1.0,
                weight * (2.0 / 3.0),
                weight * (2.0 / 4.0),
                weight * (3.0 / 2.0),
                weight * (3.0 / 4.0),
                weight * (4.0 / 2.0),
                weight * (4.0 / 3.0)
            };
            
            for(double ratio : ratios) {
                result += map.getOrDefault(ratio, 0);
            }
            
            map.put(weight*1.0, map.getOrDefault(weight*1.0, 0) + 1);
        }
            
        return result;
    }
}