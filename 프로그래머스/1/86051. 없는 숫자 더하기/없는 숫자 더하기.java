class Solution {
    public int solution(int[] numbers) {
        String num = "";
        int result = 0;
        
        for(int i=0; i<numbers.length; i++) {
            num += numbers[i] + "";
        }
        
        System.out.println(num);
        
        for(int i=0; i<=9; i++) {
            if(!num.contains(i+"")) result += i;
        }
        
        return result;
    }
}