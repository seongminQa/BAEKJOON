import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 모든 달은 28까지로 가정
        
        ArrayList<Integer> list = new ArrayList<>();
        
        String[] todayArray = today.split("\\."); // "."은 특수 문자로 인식됨. 따라서 이스케이프 문자를 사용해야함

        int todayVal = Integer.parseInt(todayArray[0])*12*28 
            + Integer.parseInt(todayArray[1])*28 
            + Integer.parseInt(todayArray[2]);

        for(int i=0; i<privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            
            for(int j=0; j<terms.length; j++) {
                if(terms[j].contains(privacy[1])) {
                    String[] termArray = terms[j].split(" ");
                        
                    String[] privacyArray = privacy[0].split("\\.");
                    
                    int privacyVal = Integer.parseInt(privacyArray[0])*12*28 
                        + (Integer.parseInt(privacyArray[1]) + Integer.parseInt(termArray[1]))*28 
                        + Integer.parseInt(privacyArray[2]) - 1;
                    
                    if(privacyVal < todayVal) {
                        list.add(i+1);
                    }
                }
            }
        }
        
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        // return new int[] {1,2};
        return result;
    }
}