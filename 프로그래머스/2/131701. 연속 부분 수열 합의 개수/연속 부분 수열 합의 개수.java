import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        
        // 총 요소들의 길이만큼 반복할 수 있음
        for(int idx=0; idx<len; idx++) {
            // 요소의 기준을 잡는 첫 위치
            for(int front=0; front<len; front++) {
                // 첫 위치부터 +idx까지의 합
                int sum = 0;
                for(int rear=front; rear<=front+idx; rear++) {
                    sum += elements[rear % len];
                }
                // System.out.println(sum);
                set.add(sum);
            }
        }
        result += set.size();
        return result;
    }
}