class Solution {
    public int solution(int n) {
        int answer = 2;

        // for(int i = n-1; i > 0; i--) {
        //     if(n % i == 1) {
        //         answer = i;
        //     }
        // }
        
        while(true) {
            if(n % answer == 1) break;
            ++answer;
        }
        
        return answer;
    }
}