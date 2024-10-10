import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {        
        int[] result = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int idx = 0;
        for(String[] photoName : photo) {
            for(int i=0; i<photoName.length; i++) {
                if(map.containsKey(photoName[i])) {
                    result[idx] += map.get(photoName[i]);
                }
            }
            ++idx;
        }
        
        return result;
    }
}