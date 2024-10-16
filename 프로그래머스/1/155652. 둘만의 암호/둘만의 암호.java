import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String result = "";
        Set<Character> skipSet = new HashSet<>();
        
        for(char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            int tempIdx = 0;
            
            while(tempIdx < index) {
                ++c;
                if(c > 'z') {
                    c = 'a';
                }
                
                if(!skipSet.contains(c)) ++tempIdx;
            }
            result += c;
        }
        
        return result;
    }
}