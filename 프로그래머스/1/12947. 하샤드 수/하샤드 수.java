class Solution {
    public boolean solution(int x) {
        String num = String.valueOf(x);
        int checkNum = 0;
        
        for(int i=0; i<num.length(); i++) {
            checkNum += num.charAt(i) - '0';
        }
        
        System.out.println(checkNum);
        
        if(x % checkNum == 0) return true;
        else return false;
        
    }
}