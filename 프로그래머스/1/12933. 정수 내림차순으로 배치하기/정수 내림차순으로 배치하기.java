// '버블 정렬'을 사용하여 풀어보기

class Solution {
    public long solution(long n) {
        String result = "";
        String[] number = String.valueOf(n).split("");
        
        for(int i=0; i<number.length; i++) {
            for(int j=0; j<number.length-1; j++) {
                if(Integer.parseInt(number[j]) > Integer.parseInt(number[j+1])) {
                    int temp = Integer.parseInt(number[j]);
                    number[j] = number[j+1];
                    number[j+1] = String.valueOf(temp);
                }
            }
        }
        
        for(int i=0; i<number.length; i++) {
            System.out.println("number[" + i + "] = " + number[i]);
            result = number[i] + result;
        }
        
        return Long.parseLong(result);
    }
}