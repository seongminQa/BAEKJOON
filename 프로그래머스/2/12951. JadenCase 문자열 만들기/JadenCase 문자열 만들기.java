// 네번째 시도
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean gap = true;
        
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                sb.append(c);
                gap = true;
            } else {
                if(gap) {
                    if(!Character.isDigit(c)) {
                        sb.append(Character.toUpperCase(c));
                    } else {
                        sb.append(c);
                    }
                    gap = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            }
        }

        return sb.toString();
    }
}