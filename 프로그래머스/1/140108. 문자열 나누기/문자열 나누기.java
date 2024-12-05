class Solution {
    public int solution(String s) {
        int index = 0;
        int result = 0;
        
        while(index < s.length()) {
            char c1 = s.charAt(index);
            int current_cnt = 0;
            int other_cnt = 0;
            
            for(int i=index; i<s.length(); i++) {
                char c2 = s.charAt(i);
                
                if(c1 == c2) ++current_cnt;
                if(c1 != c2) ++other_cnt;
                if(current_cnt == other_cnt) {
                    index = i + 1;
                    ++result;
                    break;
                }
                if(i + 1 == s.length()) {
                    index = i + 1;
                    ++result;
                }
            }
        }
        
        return result;
    }
}