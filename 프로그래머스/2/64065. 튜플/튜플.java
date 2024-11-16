import java.util.*;

class Solution {
    public int[] solution(String s) {
        // 문자열 파싱
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        // System.out.println(s);
        
        String[] sets = s.split("-");
        // System.out.println(Arrays.toString(sets));
        
        // 각 집합을 정렬
        Arrays.sort(sets, Comparator.comparingInt(String::length));
        // System.out.println(Arrays.toString(sets));
        
        // 결과 튜플 생성
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        
        for(String set : sets) {
            for(String num : set.split(",")) {
                int n = Integer.parseInt(num);
                if(seen.add(n)) {
                    result.add(n);
                }
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}