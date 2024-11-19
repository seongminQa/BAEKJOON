import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] score = new int[photo.length];
        
        for(int i=0; i<photo.length; i++) {
            int temp = 0;
            for(int j=0; j<name.length; j++) {
                for(String person : photo[i]) {
                    if(name[j].equals(person)) {
                        temp += yearning[j];
                        break;
                    }
                }
            }
            score[i] = temp;
        }
        
        return score;
    }
}