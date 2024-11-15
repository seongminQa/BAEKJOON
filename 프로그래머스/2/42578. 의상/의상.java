import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] garp : clothes) {
            String type = garp[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        if(map.size() == 1) return clothes.length;
        
        // for(Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + ":" + entry.getValue());
        // }
        
        int result = 1;
        for(int i : map.values()) {
            result *= i+1;
        }
        
        return result-1;
    }
}