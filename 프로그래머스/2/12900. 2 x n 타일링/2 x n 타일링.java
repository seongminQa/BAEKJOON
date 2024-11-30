class Solution {
    public Long solution(int n) {
        Long[] result = new Long[n];
        result[0] = 1L;
        result[1] = 2L;
        
        for(int i=2; i<n; i++) {
            result[i] = result[i-2] + result[i-1];
            result[i] %= 1000000007;
        }
        
        return result[n-1];
    }
}