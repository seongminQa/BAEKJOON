class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++) {
            answer[i] = (long)x * (i+1); // 오버플로우가 일어날 수 있기 때문에 long 형으로 저장해주어야 함
        }
        
        return answer;
    }
}