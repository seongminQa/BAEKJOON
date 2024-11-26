import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Double> record = new HashMap<>();
        int person = stages.length;
        
        for(int i=1; i<=N; i++) {
            int stageCnt = 0;
            for(int j=0; j<stages.length; j++) {
                if(i == stages[j]) {
                    ++stageCnt;
                }
            }
            double failureRate = (double) stageCnt / person;
            record.put(i, failureRate);
            person -= stageCnt;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            list.add(i);
        }
        
        // list.sort((o1,o2) -> Double.compare(record.get(o2), record.get(o1)));
        
        list.sort((o1, o2) -> {
            double diff = record.get(o2) - record.get(o1);
            if(diff > 0) return 1;
            else if(diff < 0) return -1;
            else return o1 - o2;
        });
        
        int[] result = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}