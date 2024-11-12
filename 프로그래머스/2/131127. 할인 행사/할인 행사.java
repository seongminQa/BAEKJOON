import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<discount.length; i++) {
            String product = discount[i];
            boolean check = true;
        
            for(int j=0; j<want.length; j++) {
                map.put(want[j], 0);
            }
            
            if(map.containsKey(product)) {
                int len = 0;
                if(i+10 > discount.length) len = discount.length;
                else len = i+10;
                
                for(int j=i; j<len; j++) {
                    if(map.containsKey(discount[j])) {
                        map.put(discount[j], map.getOrDefault(discount[j], 0) + 1);
                    }
                }
            }
            
            for(int j=0; j<want.length; j++) {
                if(map.get(want[j]) < number[j]) check = false;
            }
            
            if(check) {
                ++result;
            }
            
            map.clear();
        }
        
        
        return result;
    }
}