import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 중복된 값이 있고, 순서를 계산해야하기 때문에 set은 사용 X
        int idx = 0;
        int[] result = new int[targets.length];
        
        // 쓰기위한 단어들을 먼저 밝힘
        for(String target : targets) {
            int totalPress = 0;
            
            // 단어가 여러개라면 첫단어부터 검사
            for(char c : target.toCharArray()) {
                
                // 휴대폰 키보드에 단어를 적을 수 있는지 검사
                int min = Integer.MAX_VALUE;
                
                for(String key : keymap) {
                    if(key.indexOf(c) != -1) { // 키보드에 포함되어있는 문자인 경우
                        if(key.indexOf(c) < min) {
                            min = key.indexOf(c);
                        }
                    }
                }
                
                if(min == Integer.MAX_VALUE) {
                    result[idx] = -1;
                    break;
                } else {
                    result[idx] += min+1;
                }
                
            }

            
            
            ++idx;
        }
        
        return result;
    }
}