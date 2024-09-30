class Solution {
    public int solution(int n) {
        int answer = 0;
        double measure = 1;
        
        while(true) {
            if(n < measure) {
                    break;
            }
            if(n % measure == 0) {
                answer += measure;
            }
            ++measure;
        }
        return answer;
    }
}