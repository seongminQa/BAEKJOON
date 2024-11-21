import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder numberList = new StringBuilder();
        StringBuilder result = new StringBuilder();
        int originalNumber = 0;
        
        while(numberList.length() < t*m) {
            
            int number = originalNumber;
            int index = numberList.length();
            
            while(true) {
                int rest = number % n;
                if(n > 10 && rest >= 10) {
                    char c = (char) ('A' + rest % 10);
                    numberList.insert(index, c);
                } else {
                    numberList.insert(index, rest);
                }
                number = number / n;
                if(number == 0) break;
            }
            ++originalNumber;
        }
        
        System.out.print(numberList.length());
        
        for(int i=p-1; i<numberList.length(); i += m) {
            result.append(numberList.charAt(i));
            if(result.length() == t) break;
        }
        
        return result.toString();
    }
}