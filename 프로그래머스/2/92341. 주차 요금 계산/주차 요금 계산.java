import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        // 누적 주차 시간
        Map<String, Integer> parkedTime = new HashMap<>();
        // 입차 시간
        Map<String, Integer> inTime = new HashMap<>();
        
        for(String recode : records) {
            String[] part = recode.split(" ");
            String time = part[0];
            String carNum = part[1];
            String inOut = part[2];
            
            // 시간 계산하기
            String[] partTime = time.split(":");
            int minutes = Integer.parseInt(partTime[0]) * 60 + Integer.parseInt(partTime[1]);
            
            if(inOut.equals("IN")) {
                inTime.put(carNum, minutes);
            } else if(inOut.equals("OUT")) {
                int duration = minutes - inTime.get(carNum);
                parkedTime.put(carNum, parkedTime.getOrDefault(carNum, 0) + duration);
                inTime.remove(carNum);
            }
        }
        
        int endTime = 23 * 60 + 59;
        for(String carNum : inTime.keySet()) {
            int duration = endTime - inTime.get(carNum);
            parkedTime.put(carNum, parkedTime.getOrDefault(carNum, 0) + duration);
        }
        
        // 주차 요금 계산
        List<String> carNums = new ArrayList<>(parkedTime.keySet());
        Collections.sort(carNums);
        
        int[] result = new int[carNums.size()];
        int idx = 0;
        
        for(String carNum : carNums) {
            int baseTime = fees[0];
            int baseFee = fees[1];
            int unitTime = fees[2];
            int unitFee = fees[3];
            
            if(parkedTime.get(carNum) <= baseTime) {
                result[idx] = baseFee;
            } else {
                result[idx] = baseFee + (int) Math.ceil((double) (parkedTime.get(carNum) - baseTime) / unitTime) * unitFee;
            }
            ++idx;
        }
        
        
        return result;
    }
}