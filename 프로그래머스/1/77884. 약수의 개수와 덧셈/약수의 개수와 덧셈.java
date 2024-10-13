class Solution {
    public int solution(int left, int right) {
        int result = 0;
        
        for(int i=left; i<=right; i++) {
            boolean check = true;
            for(int j=1; j<=i; j++) {
                if(i % j == 0) check = !check;
            }
            if(check) result += i;
            else result -= i;
        }
        return result;
    }
}