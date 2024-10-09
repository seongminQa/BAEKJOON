import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] result = new int[score.length];
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<score.length; i++) {
            if(i == 0) {
                result[i] = score[i];
                // int[] arrayCopy = Arrays.copyOf(score, i+1);
                // Arrays.sort(arrayCopy);
                // // arrayCopy = Arrays.stream(arrayCopy).distinct().toArray();
                // System.out.println("i = " + i + ", array = " + Arrays.toString(arrayCopy));
                // System.out.println("array의 길이 = " + arrayCopy.length);
            } else {
                int[] arrayCopy = Arrays.copyOf(score, i+1);
                Arrays.sort(arrayCopy);
                // arrayCopy = Arrays.stream(arrayCopy).distinct().toArray();
                // System.out.println("i = " + i + ", array = " + Arrays.toString(arrayCopy));
                // System.out.println("array의 길이 = " + arrayCopy.length);
                
                if(arrayCopy.length < k) {
                    result[i] = arrayCopy[0];
                } else {
                    result[i] = arrayCopy[arrayCopy.length-k];
                }
            }
        }
        
        return result;
    }
}