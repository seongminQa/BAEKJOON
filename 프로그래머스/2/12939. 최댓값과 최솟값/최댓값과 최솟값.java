class Solution {
    public String solution(String s) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        String[] value = s.split(" ");
        
        for(String v : value) {
            int num = Integer.parseInt(v);
            if(num < min) min = num;
            if(num > max) max = num;
        }
        
        return min + " " + max;
    }
}