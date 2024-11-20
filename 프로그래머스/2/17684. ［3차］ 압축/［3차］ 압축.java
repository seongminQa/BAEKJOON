import java.util.*;

class Solution {
    public int[] solution(String msg) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int idx = 1;
        
        for(char c='A'; c<='Z'; c++) {
            map.put(String.valueOf(c), idx++);
        }
        
        int pointer = 0;
        while(pointer < msg.length()) {
            String input = "";
            while(pointer < msg.length() && map.containsKey(input + msg.charAt(pointer))) {
                input = input + msg.charAt(pointer);
                ++pointer;
            }
            
            list.add(map.get(input));
            
            if(pointer < msg.length()) {
                map.put(input + msg.charAt(pointer), idx++);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}