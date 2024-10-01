class Solution {
    public long[] solution(long x, int n) {
        // long[] answer = {};
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++) {
            answer[i] = x * (i+1);
        }
        
        // int i = 0;
        // while(i < n) {
        //     answer[i] = x * (i+1);
        //     ++i;
        // }
        
        return answer;
    }
}