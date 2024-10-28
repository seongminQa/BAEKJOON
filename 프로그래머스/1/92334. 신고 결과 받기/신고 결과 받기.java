import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고 내역을 저장하는 Map. 키 -> 신고당한 유저, 값 -> 신고자 목록
        Map<String, Set<String>> reportMap = new HashMap<>();
        
        // 각 유저가 몇 번 신고 당했는지 카운트 하는 Map
        Map<String, Integer> reportCount = new HashMap<>();
        
        // 결과 메일 횟수를 기록할 배열
        int[] result = new int[id_list.length];
        
        // 1. 중복 신고 제거 및 신고 내역 정리
        for(String entry : report) {
            String[] parts = entry.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            // reported 키가 맵에 없을 경우, new HashSet<>()을 값으로 추가.
            reportMap.putIfAbsent(reported, new HashSet<>());
            // reporter를 해당 Set에 추가
            reportMap.get(reported).add(reporter);
        }
        
        // for (Map.Entry<String, Set<String>> entry : reportMap.entrySet()) {
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
        
        // 2. 각 유저의 신고 횟수 카운트
        for(String reported : reportMap.keySet()) {
            int cnt = reportMap.get(reported).size();
            reportCount.put(reported, cnt);
        }
        
        // 3. 정지된 유저를 신고한 유저에게 메일 발송 횟수 추가
        for(String reported : reportMap.keySet()) {
            if(reportCount.get(reported) >= k) {
                for(String reporter : reportMap.get(reported)) {
                    int idx = Arrays.asList(id_list).indexOf(reporter);
                    ++result[idx];
                }
            }
        }
        
        return result;
    }
}