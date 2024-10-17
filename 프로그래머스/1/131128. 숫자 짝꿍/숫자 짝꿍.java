import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];
        
        for(char c : X.toCharArray()) {
            ++x[c-'0'];
        }
        
        for(char c : Y.toCharArray()) {
            ++y[c-'0'];
        }
        
        // String result = "";
        StringBuilder result = new StringBuilder();
        
        for(int i=9; i>=0; i--) {
            int cnt = Math.min(x[i], y[i]);
            for(int j=0; j<cnt; j++) {
                // result += i;
                result.append(i);
            }
        }
        
//         if(result.equals("")) return "-1";
            if (result.length() == 0) return "-1";
            if (result.charAt(0) == '0') return "0";

//         if(result.charAt(0) == '0') return "0";
        
//         return result;
            return result.toString();
    }
}