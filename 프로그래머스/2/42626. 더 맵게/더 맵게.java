import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int result = 0;
        
        for(int sco : scoville) {
            pq.add(sco);
        }
        
        while(pq.size() > 1 && pq.peek() < K) {
            int first = pq.poll();
            int second = pq.poll();
            int mix = first + (second * 2);
            
            pq.add(mix);
            ++result;
        }
        
        if(pq.peek() < K) return -1;
        
        return result;
    }
}