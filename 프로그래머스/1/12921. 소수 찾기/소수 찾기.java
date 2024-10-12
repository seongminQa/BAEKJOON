class Solution {
    public int solution(int n) {
        int result = 0;
        if(n >= 2) result = 1;
        
        for(int i=3; i<=n; i++) {
            if(Decimal(i)) result++;
        }
        
        return result;
    }
    
    public static boolean Decimal(int number) {
        for(int j=2; j<=Math.sqrt(number); j++) {
            if(number % j == 0) return false;
        }
        return true;
    }
}