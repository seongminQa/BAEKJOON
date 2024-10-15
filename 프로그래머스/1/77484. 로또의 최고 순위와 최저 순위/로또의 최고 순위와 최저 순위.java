import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> minwoo = new ArrayList<>();
        HashMap<Integer, Integer> result = new HashMap<>();
        result.put(6, 1);
        result.put(5, 2);
        result.put(4, 3);
        result.put(3, 4);
        result.put(2, 5);
        result.put(1, 6);
        result.put(0, 6);
        int cnt = 0;
        
        for(int num : lottos) {
            if(num != 0)
                minwoo.add(num);
        }

        // System.out.println(minwoo);
        // System.out.println(minwoo.size());
        
        for(int num : win_nums) {
            if(minwoo.contains(num)) {
                ++cnt;
            }
        }
        
        
        return new int[] {result.get(cnt+(6-minwoo.size())),result.get(cnt)};
    }
}