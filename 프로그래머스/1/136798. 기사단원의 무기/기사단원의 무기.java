class Solution {
    public int solution(int number, int limit, int power) {
        int result = 0;
        int[] cnt = new int[number];

        for(int i=1; i<=number; i++) {
            int value = 0;
            
            for(int j=1; j*j<=i; j++) {
                if(i % j == 0) {
                    ++value;
                    if(j != i / j) {
                        ++value;
                    }
                }
            }
            cnt[i-1] = value;
            
            if(cnt[i-1] <= limit) result += cnt[i-1];
            else result += power;
        }
        
        return result;
    }
}