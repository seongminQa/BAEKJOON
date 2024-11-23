class Solution {
    public int solution(int number, int limit, int power) {
        int result = 1;
        
        for(int i=2; i<=number; i++) {
            int num = i;
            int divisorCnt = 1;
            // System.out.println("num = " + num +"의 sqrt = " + Math.sqrt(num));
            for(int j=1; j<=num/2; j++) {
                if(num % j == 0) ++divisorCnt;
            }
            // System.out.println("num = " + num +"의 약수갯수 = " + divisorCnt);
            if(divisorCnt <= limit) {
                result += divisorCnt;
            } else {
                result += power;
            }
        }
        
        return result;
    }
}