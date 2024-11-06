import java.util.*;

public class Solution {
    public int solution(int n) {
        // 순간이동 -> 2의 제곱승
        if(n == 1) return 1;
        
        int ans = 1;
        
        while(n>1) {
            if(n % 2 == 1) {
                ++ans;
            }
            n = n/2;
        }
        
        return ans;
    }
}