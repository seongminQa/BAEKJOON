class Solution {
    public int solution(String[] babbling) {
        int result = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        
        for (String word : babbling) {
            String prev = "";  // 이전 발음을 저장할 변수
            boolean valid = true;  // 유효한 발음인지 확인하는 플래그

            while (valid && word.length() > 0) {
                boolean found = false;  // 현재 발음을 찾았는지 여부
                
                // 발음 목록을 순회
                for (String s : str) {
                    if (word.startsWith(s)) {
                        if (s.equals(prev)) {  // 연속된 발음이면 무효 처리
                            valid = false;
                            break;
                        }
                        prev = s;  // 이전 발음을 현재 발음으로 업데이트
                        word = word.substring(s.length());  // 발음 제거
                        found = true;
                        break;
                    }
                }

                // 현재 발음을 찾지 못하면 무효 처리
                if (!found) {
                    valid = false;
                }
            }

            // 남은 문자열이 없고 유효한 발음일 때만 카운트 증가
            if (valid && word.length() == 0) {
                result++;
            }
        }

        return result;
    }
}
