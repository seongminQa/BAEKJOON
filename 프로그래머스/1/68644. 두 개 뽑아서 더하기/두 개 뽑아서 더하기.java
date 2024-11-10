import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i != j) set.add(numbers[i] + numbers[j]);
            }
        }
        
        for(int i : set) {
            list.add(i);
        }
        
        Collections.sort(list);
        System.out.println(list.toString());
        
        int[] result = new int[list.size()];

        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}