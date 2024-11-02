class Solution {
    public int solution(int n) {
        int result = 0;
        int value = 1;
        int cnt = 0;
        
        while(true) {
            int check = 0;
            for(int i=value; i<= n; i++) {
                check += i;
                // System.out.println("check = " + check);
                if(check == n) {
                    // System.out.println("check = " + check);
                    ++result;
                    break;
                } else if(check > n) {
                    break;
                }
            }
            if(value == n) break;
            ++value;
        }
        
        return result;
    }
}