import java.util.*;

/*
    최소 횟수를 구하는 문제이기 때문에 BFS로 접근..
*/

class Solution {
    public int solution(int x, int y, int n) {
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        q.add(new int[] {x, 0});
        visited.add(x);
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int value = current[0];
            int depth = current[1];
            
            if(value == y) return depth;
            
            int[] nextValues = {value + n, value*2, value*3};
            for(int nextValue : nextValues) {
                if(nextValue <= y && !visited.contains(nextValue)) {
                    visited.add(nextValue);
                    q.add(new int[] {nextValue, depth + 1});
                }
            }
            
        }
        
        return -1;
    }
}