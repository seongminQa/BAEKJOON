import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<int[]> list = new ArrayList<>();
        
        Map<String, Integer> map = new HashMap<>();
        map.put("code", 0);
        map.put("date", 1);
        map.put("maximum", 2);
        map.put("remain", 3);
        
        for(int i=0; i<data.length; i++) {
            if(data[i][map.get(ext)] < val_ext) {
                list.add(data[i]);
            }
        }
        
        // 출력 확인
        // for(int[] pr : list) {
        //     System.out.println(Arrays.toString(pr));
        // }
        
        // 리스트에서 특정 인덱스를 기준으로 정렬 (람다식)
        list.sort((a, b) -> Integer.compare(a[map.get(sort_by)], b[map.get(sort_by)]));
        
        // 출력 확인
        // for(int[] pr : list) {
        //     System.out.println(Arrays.toString(pr));
        // }
        
        // List<int[]>를 int[][]로 변환
        int[][] result = new int[list.size()][4];
        for(int i=0; i<list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}