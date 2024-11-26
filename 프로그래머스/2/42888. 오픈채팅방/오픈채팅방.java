import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> id_nickname = new HashMap<>();
        List<String> informationList = new ArrayList<>();
            
        for(String str : record) {
            String[] division = str.split(" ");
            String action = division[0];
            String id = division[1];
            if(!action.equals("Leave")) {
                String nickname = division[2];
                id_nickname.put(id, nickname);
            }
        }
        
        for(String str : record) {
            String[] division = str.split(" ");
            String action = division[0];
            String id = division[1];
            if(action.equals("Enter")) {
                informationList.add(id_nickname.get(id) + "님이 들어왔습니다.");
            } else if(action.equals("Leave")) {
                informationList.add(id_nickname.get(id) + "님이 나갔습니다.");
            }
        }
        
        String[] result = new String[informationList.size()];
        for(int i=0; i<informationList.size(); i++) {
            result[i] = informationList.get(i);
        }
        
        return result;
    }
}