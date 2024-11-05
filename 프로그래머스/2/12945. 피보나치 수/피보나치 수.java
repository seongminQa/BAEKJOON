class Solution {
    public int solution(int n) {
        if(n == 0) return 0;
        if(n == 1 || n == 2) return 1;
        
        int beforeNum = 1;
        int afterNum = 1;
        int result = 0;
        
        for(int i=3; i<=n; i++) {
            result = (beforeNum + afterNum) % 1234567;
            beforeNum = afterNum;
            afterNum = result;
        }
        
        return result;
    }
}