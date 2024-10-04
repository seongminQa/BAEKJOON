class Solution {
    public boolean solution(String s) {
        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i) > '0') return false;
        // }
        
        if(s.length() == 4 || s.length() == 6){
            try {
            Integer.parseInt(s);
        } catch(Exception e) {
            return false;
        }
        return true;
        }
        
        return false;
    }
}