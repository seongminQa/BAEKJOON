import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++) {
            q.add(new int[] {priorities[i], i});
        }
 
        int order = 0;
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            // System.out.println(Arrays.toString(current));
            
            boolean checkPriority = false;
            
            for(int[] p : q) {
                if(p[0] > current[0]) {
                    checkPriority = true;
                    break;
                }
            }
            
            if(checkPriority) {
                q.add(current);
            } else {
                ++order;
                if(current[1] == location) {
                    return order;
                }
            }
            
            // for(int[] arr : q) {
            //     System.out.println("큐 요소 : " + Arrays.toString(arr));
            // }
        }
        
        return -1;
    }
}