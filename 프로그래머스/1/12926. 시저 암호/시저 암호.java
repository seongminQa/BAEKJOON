class Solution {
    public String solution(String s, int n) {
        String result = "";
        int len = s.length();
        
        for(int i=0; i<len; i++) {
            if(s.charAt(i) == ' ') result += " ";
            else {
                if(s.charAt(i) >= 'a') {
                    if(s.charAt(i) + n > 'z') result += Character.toString(s.charAt(i) + n - 26);
                    else result += Character.toString(s.charAt(i) + n);
                } else if(s.charAt(i) >= 'A') {
                    if(s.charAt(i) + n > 'Z') result += Character.toString(s.charAt(i) + n - 26);
                    else result += Character.toString(s.charAt(i) + n);
                }

            }
        }
        
        return result;
    }
}