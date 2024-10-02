import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {  
        int[] temp = new int[arr.length];
        int cnt = 0;
        
        System.out.println(arr.length);
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                temp[cnt] = arr[i];
                ++cnt;
            }
        }
        
        if(cnt == 0) {
            int[] result = {-1};
            return result;
        }
        
        int[] result = new int[cnt];
        
        for(int i=0; i<cnt; i++) {
            result[i] = temp[i];
        }

        System.out.println();
        Arrays.sort(result);
        return result;
        
        // int[] num = {-1};
        // System.out.println(num);
        // return num;
        
    }
}