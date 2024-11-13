import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        Queue<String> q = new LinkedList<>();
        int time = 0;

        for (String city : cities) {
            city = city.toLowerCase();

            if (q.contains(city)) { // 캐시 히트
                time += 1;
                q.remove(city); // 최근 사용된 항목으로 갱신하기 위해 제거 후 재삽입
                q.offer(city);
            } else { // 캐시 미스
                time += 5;
                if (q.size() == cacheSize) { // 캐시가 가득 찬 경우
                    q.poll(); // 가장 오래된 항목 제거
                }
                q.offer(city);
            }
        }

        return time;
    }
}
