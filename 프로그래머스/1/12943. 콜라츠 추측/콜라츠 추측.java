class Solution {
    public int solution(long num) {
        int answer = 0;
        
        if(num == 1) return 0;
        
        while(true) {
            if(num == 1) break;
            if(num % 2 == 0) {
                num = num / 2;
            }
            else {
                num = (num * 3) + 1;
            }
            ++answer;
        }
        
        System.out.println(answer);
        System.out.println(num);
        
        if(answer >= 500) return -1;
        else return answer;
    }
}