class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] result = new int[2];
        
        while(true) {
            // 2진 변환하기
            for(int i=0; i<s.length(); i++) {
                char c = s.charAt(i);
                
                if(c == '1') sb.append(1);
            }
            
            ++result[0];
            result[1] += s.length() - sb.length();
            
            if(sb.length() == 1) break;
            
            int len = sb.length();
            sb.setLength(0);
            
            while(true) {
                int rest = len % 2;
                sb.append(rest);
                len = len / 2;
                if(len == 1) {
                    sb.append(len);
                    break;
                }
            }
            
            s = sb.toString();
            sb.setLength(0);
        }

        return result;
    }
}