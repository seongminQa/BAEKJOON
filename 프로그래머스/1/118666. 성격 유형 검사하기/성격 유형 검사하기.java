import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        char[][] types = {{'R', 'T'}, {'C','F'}, {'J', 'M'}, {'A', 'N'}};
        
        // choices -> 1 2 3 (4) 5 6 7
        
        for(char[] type : types) {
            map.put(type[0], 0);
            map.put(type[1], 0);
        }
        
        for(int i=0; i<survey.length; i++) {
            if(choices[i] < 4) {
                int tempScore = Math.abs(4-choices[i]);
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + tempScore);
            } else if(choices[i] > 4) {
                int tempScore = Math.abs(4-choices[i]);
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + tempScore);
            }
        }

        // map 확인
        // for(Map.Entry<Character, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        
        for(char[] type : types) {
            if(map.get(type[0]) >= map.get(type[1])) {
                result.append(type[0]);
            } else {
                result.append(type[1]);
            }
        }
        
        return result.toString();
    }
}