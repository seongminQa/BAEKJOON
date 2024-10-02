class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b) return a;
        // if(a > b) {
        //     for(int i=b; i<=a; i++) {
        //         answer += i;
        //     }
        //     return answer;
        // } else {
        //     for(int i=a; i<=b; i++) {
        //         answer += i;
        //     }
        //     return answer;
        // }
        
        return a - b < 0 ? (long) (a+b) * (b-a+1) / 2 : (long) (a+b) * (a-b+1) / 2;
        
    }
}