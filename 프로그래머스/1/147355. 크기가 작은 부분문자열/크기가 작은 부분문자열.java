class Solution {
    public int solution(String t, String p) {
        int result = 0;
        int tLength = t.length();
        int pLength = p.length();
        long pVal = Long.valueOf(p);
        
        for(int i=0; i<tLength-pLength+1; i++) {
            if(Long.valueOf(t.substring(i,i+pLength)) <= pVal) ++result;
        }
        
        return result;
    }
}