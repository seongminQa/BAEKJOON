import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        int len = players.length;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<len; i++) {
            map.put(players[i], i);
        }
        
        // map 확인
//         for(Map.Entry<String, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " : " + entry.getValue());
//         }
        
//         System.out.println();
        
        for(String calling : callings) {
            int curIdx = map.get(calling);
            
            if(curIdx > 0) {
                String prevPlayer = players[curIdx - 1];
                
                players[curIdx - 1] = calling;
                players[curIdx] = prevPlayer;
                
                map.put(calling, curIdx - 1);
                map.put(prevPlayer, curIdx);
            }
        }
        
        // map 확인
        // for(Map.Entry<String, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        
        return players;
    }
}