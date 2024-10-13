// 삽입 정렬로 풀어보기
class Solution {
    public long solution(long n) {
        String result = "";
        String[] number = String.valueOf(n).split("");
        int len = number.length;
        int temp = 0;
        
        for(int i=1; i<len; i++) {
            // 삽입 정렬은 두번째 인덱스 부터 선택
            temp = Integer.parseInt(number[i]);
            for(int j=i-1; j>=0; j--) {
                if(Integer.parseInt(number[j]) > temp) {
                    number[j+1] = number[j];
                    number[j] = String.valueOf(temp);
                }
            }
        }
        
        for(int i=0; i<len; i++) {
            result = number[i] + result;
        }
        
        
        return Long.parseLong(result);
    }
}