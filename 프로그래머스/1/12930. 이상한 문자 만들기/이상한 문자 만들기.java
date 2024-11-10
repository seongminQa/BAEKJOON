class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 1;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ') {
                idx = 1;
                sb.append(c);
                continue;
            }
            
            if(idx % 2 == 1) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
            ++idx;
        }
        
        return sb.toString();
    }
}