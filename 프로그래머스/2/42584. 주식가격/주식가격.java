import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len = prices.length;
        int[] result = new int[len];
        
        for(int i=0; i<len; i++) {
            for(int j=1+i; j<len; j++) {
                ++result[i];
                if(prices[i] > prices[j]) break;
            }
        }
        
        return result;
    }
}