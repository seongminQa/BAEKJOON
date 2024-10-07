import java.util.*;

class Solution {
    public Integer[] solution(int[] numbers) {
        HashSet<Integer> number = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++){
                if(i != j) number.add(numbers[i] + numbers[j]);
            }
        }

        Integer[] result = number.toArray(new Integer[0]);
        System.out.println(result.toString());
        
        int[] a = new int[0];
        Arrays.sort(result);
        return result;
    }
}