class Solution {
    public int solution(int a, int b, int n) {
        // a는 빈 병
        // b는 빈 병이 아닌 콜라
        // n은 빈 병의 갯수
        int result = 0;
        
        while(n >= a) {
            result += (n/a) * b;
            n = (n/a)*b + (n%a);
        }
        
        return result;
    }
}