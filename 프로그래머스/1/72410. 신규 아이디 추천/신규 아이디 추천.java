class Solution {
    public String solution(String new_id) {
        // 1단계: 대문자를 소문자로 변환
        new_id = new_id.toLowerCase();
        
        // 2단계: 소문자, 숫자, -, _, . 외의 문자 제거
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");
        
        // 3단계: 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        new_id = new_id.replaceAll("\\.{2,}", ".");
        
        // 4단계: 마침표(.)가 처음이나 끝에 위치한다면 제거
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        
        // 5단계: 빈 문자열이라면, "a"를 대입
        if (new_id.length() == 0) {
            new_id = "a";
        }
        
        // 6단계: 16자 이상이면 첫 15자를 제외한 나머지 문자 제거
        if (new_id.length() > 15) {
            new_id = new_id.substring(0, 15);
            // 끝에 마침표가 있으면 제거
            new_id = new_id.replaceAll("\\.$", "");
        }
        
        // 7단계: 길이가 2자 이하라면 마지막 문자를 반복해서 길이를 3으로 맞춤
        while (new_id.length() < 3) {
            new_id += new_id.charAt(new_id.length() - 1);
        }
        
        return new_id;
    }
}
