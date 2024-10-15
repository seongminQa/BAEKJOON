class Solution {
    public int solution(String s) {
        int wordCnt = 0;  // 분리된 문자열의 개수
        int i = 0;  // 문자열을 순차적으로 탐색할 인덱스
        
        // 1. 문자열을 끝까지 탐색할 때까지 반복
        while (i < s.length()) {
            char x = s.charAt(i);  // 첫 글자
            int countX = 0;  // x의 개수
            int countOther = 0;  // x가 아닌 글자의 개수
            
            // 2. 두 개수(countX와 countOther)가 같아질 때까지 반복
            while (i < s.length()) {
                if (s.charAt(i) == x) {
                    countX++;
                } else {
                    countOther++;
                }
                i++;
                
                // 3. 두 개수가 같아지면 해당 부분을 분리
                if (countX == countOther) {
                    break;
                }
            }
            
            // 4. 분리된 문자열 카운트 증가
            wordCnt++;
        }
        
        return wordCnt;
    }
}
