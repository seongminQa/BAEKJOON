import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> requireDayList = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int remaining = 100 - progresses[i];
            int days = remaining % speeds[i] == 0 ? remaining / speeds[i] : remaining / speeds[i] + 1;
            requireDayList.add(days);
        }
        
        while(!requireDayList.isEmpty()) {
            int currentDay = requireDayList.get(0);
            int count = 0;
            
            for(int i=0; i<requireDayList.size(); ) {
                if(requireDayList.get(i) <= currentDay) {
                    requireDayList.remove(i);
                    ++count;
                } else {
                    break;
                }
            }
            result.add(count);
        }
        
        int[] answer = new int[result.size()];
        
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}