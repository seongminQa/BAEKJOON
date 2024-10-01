import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        String num1 = String.valueOf(n);
        
        System.out.println(num1);

        String[] num2 = num1.split("");
        
        for(int i=0; i<num2.length; i++) {
            System.out.print(num2[i]);
        }
        System.out.println();
        Arrays.sort(num2, Collections.reverseOrder());
        
        String result = "";
        
        for(int i=0; i<num2.length; i++) {
            System.out.print(num2[i]);
            result += num2[i];
        }
        
        return Long.parseLong(result);
    }
}