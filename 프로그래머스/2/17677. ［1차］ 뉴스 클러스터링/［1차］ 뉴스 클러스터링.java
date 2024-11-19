import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> str1_word = new ArrayList<>();
        List<String> str2_word = new ArrayList<>();
        
        // 두 글자 단어 만들기
        for(int i=0; i<str1.length()-1; i++) {
            if(Character.isAlphabetic(str1.charAt(i)) && Character.isAlphabetic(str1.charAt(i+1))) {
                str1_word.add(""+str1.charAt(i)+str1.charAt(i+1));
            }
        }
        
        for(int i=0; i<str2.length()-1; i++) {
            if(Character.isAlphabetic(str2.charAt(i)) && Character.isAlphabetic(str2.charAt(i+1))) {
                str2_word.add(""+str2.charAt(i)+str2.charAt(i+1));
            }
        }
        
        if(str1_word.size() == 0 && str2_word.size() == 0) return 65536;
        
        // 확인
        // for(String word : str1_word) {
        //     System.out.println(word);
        // }
        // System.out.println();
        // for(String word : str2_word) {
        //     System.out.println(word);
        // }
        
        int intersection = 0;
        int union = 0;
        
        // 교집합의 갯수 구하기
        // for(String word : str1_word) {
        //     if(str2.contains(word)) {
        //         ++intersection;
        //     }
        // }
        List<String> str2_word_copy = new ArrayList<>(str2_word);
        for(String word : str1_word) {
            if(str2_word_copy.contains(word)) {
                ++intersection;
                str2_word_copy.remove(word);
            }
        }
        
        // System.out.println(intersection);
        
        // 합집합의 갯수 구하기
        union = str1_word.size() + str2_word.size() - intersection;
        // System.out.println(union);
        
        double Jaccard =  (double) intersection / union;
        // System.out.println(Jaccard*65536);
        int result = (int) (Jaccard*65536);
        
        return result;
    }
}