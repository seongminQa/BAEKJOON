import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        // 누가 누구에게 몇번 선물을 주었는지 기록하는 map
        Map<String, Map<String, Integer>> giftRecords = new HashMap<>();
        // 선물 지수를 기록하는 map -> 두명이 서로 똑같이 선물했다면 다른 친구들에게 준 선물의 개수로 선물 지수 기록
        Map<String, Integer> giftScore = new HashMap<>();
        // 다음 달에 선물을 받을 개수를 기록하는 map
        Map<String, Integer> nextMonthGifts = new HashMap<>();
        
        // 우선 연산에 쓰기위해 Map을 초기화 시켜준다.
        for(String friend : friends) {
            giftRecords.put(friend, new HashMap<>());
            giftScore.put(friend, 0);
            nextMonthGifts.put(friend, 0);
        }
        
        // 선물을 주고 받은 기록을 이용
        for(String gift : gifts) {
            String[] name = gift.split(" ");
            String sender = name[0];
            String receiver = name[1];
            
            // 누가 누구에게 선물을 몇번 선물을 했는지 기록
            giftRecords.get(sender).put(receiver, giftRecords.get(sender).getOrDefault(receiver, 0) + 1);
            // 선물 지수를 계산
            giftScore.put(sender, giftScore.get(sender) + 1);
            giftScore.put(receiver, giftScore.get(receiver) - 1);
        }
        
//         for (Map.Entry<String, Map<String, Integer>> entry : giftRecords.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
        
//         for (Map.Entry<String, Integer> entry : giftScore.entrySet()) {
//             System.out.println(entry.getKey() + ": " + entry.getValue());
//         }
        
        // 이중 for문으로 준 사람과 받은 사람을 비교
        for(String sender : friends) {
            for(String receiver : friends) {
                if(!sender.equals(receiver)) {
                    // 누가 누구에게 몇번 선물 했는지 나타내는 정수
                    int giftFromSender = giftRecords.get(sender).getOrDefault(receiver, 0);
                    // 누가 누구에게 몇번 선물을 받았는지 나타내는 정수
                    int giftFromReceiver = giftRecords.get(receiver).getOrDefault(sender, 0);
                    
                    if(giftFromSender > giftFromReceiver) {
                        // 선물을 보낸 사람이 선물을 받은 사람보다 선물의 갯수가 많을 경우
                        nextMonthGifts.put(sender, nextMonthGifts.get(sender) + 1);
                    } else if(giftFromSender == giftFromReceiver 
                             && giftScore.get(sender) > giftScore.get(receiver)) {
                        // 서로 선물을 똑같이 주고 받았을 경우, 선물 지수가 더 높은 사람에게 +1
                        nextMonthGifts.put(sender, nextMonthGifts.get(sender) + 1);
                    }
                }
            }
        }
        
        return Collections.max(nextMonthGifts.values());
    }
}