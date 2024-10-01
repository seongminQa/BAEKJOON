import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        
        for(int i=0; i<num.length(); i++) {
            answer += num.charAt(i) - 48;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(num);
        System.out.println(answer);

        return answer;
    }
}