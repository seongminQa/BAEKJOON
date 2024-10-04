class Solution {
    public int[] solution(int n, int m) {
        int a = 0; // 최대공약수
        int b = 0; // 최소공배수
        int r = 0;
        
        if(n > m) {
            a = n;
            b = m;
        } else {
            a = m;
            b = n;
        }
        
        while(true) {
            r = a % b;
            a = b;
            b = r;
            
            if(r == 0) break;
        }
        
        if(a == 1) b = n*m;
        else b = n*m/a;
        
        int[] answer = {a, b};
        return answer;
    }
}