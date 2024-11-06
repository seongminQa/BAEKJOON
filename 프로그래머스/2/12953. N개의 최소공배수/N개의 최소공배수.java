import java.util.*;

class Solution {
    public int solution(int[] arr) {
        // 최소공배수 = 최대공약수 * 서로소
        Arrays.sort(arr);
        int result = arr[0];
        
        for(int i=1; i < arr.length; i++) {
            int a = result;
            int b = arr[i];
            // 유클리드 호제법 이용
            while(b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }
            // a는 두 수의 최대공약수
            result = (result * arr[i]) / a;
        }
        
        return result;
    }
}