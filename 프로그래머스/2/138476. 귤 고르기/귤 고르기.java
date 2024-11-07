import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int result = 0;
        // 배열에 최저 빈도로 나타내는 수 빼기
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }
        
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        
        // 귤의 갯수를 내림차 순으로 정렬
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        
        int cnt = 0;
        
        for(int number : list) {
            cnt += number;
            ++result;
            if(cnt >= k) break;
        }
        
        return result;
    }
}