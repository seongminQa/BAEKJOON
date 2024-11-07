import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int idx = 2;
        int gameCnt = 1;
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for(int i=1; i<words.length; i++) {
            String prev = words[i-1];
            String current = words[i];
            
            if(idx > n) { 
                idx = 1;
                ++gameCnt;
            }
            
            if(prev.charAt(prev.length()-1) == current.charAt(0)) {
                if(!set.contains(current)) {
                    set.add(current);
                    ++idx;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        
        if(set.size() == words.length) {
            idx = 0;
            gameCnt = 0;
        }
        
        return new int[] {idx, gameCnt};
    }
}