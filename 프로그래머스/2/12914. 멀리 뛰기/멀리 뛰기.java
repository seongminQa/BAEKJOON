class Solution {
    public long solution(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        
        long result = 0;
        // f(1) = 0 + 1, f(2) = 1 + 1, f(3) = 2 + 1, f(4) = 3 + 2
        long a = 1;
        long b = 2;
        
        for(int i=3; i<=n; i++) {
            result = (b + a) % 1234567L;
            a = b;
            b = result;
        }
        
        return result;
    }
}