import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int result = 0;
        // 배열을 활용하여 최적의 수 찾기
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length-1;
        
        while(left <= right) {
            // 만약 가장 가벼운 사람과 가장 무거운 사람을 같이 태울 수 있다면
            if(people[left] + people[right] <= limit) {
                ++left;
                --right;
                ++result;
                continue;
            }
            
            // 위의 조건문이 아니라면 무거운 사람하나만 태움
            --right;
            ++result;
        }
        
        return result;
    }
}