class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        // luy는 "..#.." 에서 "#"의 위치의 최솟값
        // lux는 String 배열 내에서 처음으로 "#"이 등장하는 위치
        // rdy는 "..#.." 에서 "#"의 위치의 최댓값
        // rdx는 String 배열 내에서 마지막으로 등장하는 "#"의 위치
        
        for(int i=0; i<wallpaper.length; i++) {
            String row = wallpaper[i];
            
            for(int j=0; j<row.length(); j++) {
                if(row.charAt(j) == '#') {
                    // x는 '행'을 의미
                    // lux는 처음으로 '#'이 들어가 있는 열을 저장
                    lux = Math.min(lux, i);
                    // y는 '열'을 의미
                    // luy는 문자열들 중 '#'이 가장 앞에 있는 위치를 저장
                    luy = Math.min(luy, j);
                    
                    // rdx는 마지막으로 '#'이 포함된 행을 의미. 파일을 포함해야하기 때문에 +1을 해줌
                    rdx = Math.max(rdx, i + 1);
                    // rdy는 문자열들 중 '#'이 가장 마지막에 있는 위치를 저장
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }
        
        return new int[] {lux, luy, rdx, rdy};
    }
}