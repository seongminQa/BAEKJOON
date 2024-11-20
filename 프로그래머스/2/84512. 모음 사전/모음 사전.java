import java.util.*;

/*
    DFS를 이용한 완전탐색.
    String의 정렬은 사전 순서와 비슷하지만 정확히는 Unicode 포인트 값을 기준으로 이루어짐.
    문자 길이와 상관없이 각 문자를 비교함. -> 첫 문자가 같으면 두 번째 문자를 비교하는 방식으로 이어짐.
    
*/

class Solution {
    List<String> dictionary = new ArrayList<>();
    char[] alphabet = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        generateWords("", 0);
        
        Collections.sort(dictionary);
        
        return dictionary.indexOf(word)+1;
    }
    
    private void generateWords(String current, int depth) {
        if(depth == 5) return;
        
        for(char c : alphabet) {
            String nextWord = current + c;
            dictionary.add(nextWord);
            generateWords(nextWord, depth+1);
        }
    }
}