class Solution {
    public int solution(int n) {
        int result = 0;
        String n1 = Integer.toBinaryString(n);
        int n1_cnt = 0;
        
        for(char c : n1.toCharArray()) {
            if(c == '1') ++n1_cnt;
        }
        
        while(true) {
            ++n;
            int n2_cnt = 0;
            String n2 = Integer.toBinaryString(n);
            
            for(char c : n2.toCharArray()) {
                if(c == '1') ++n2_cnt;
            }
            
            if(n1_cnt == n2_cnt) {
                result = n;
                break;
            }
        }
        
        return result;
    }
}