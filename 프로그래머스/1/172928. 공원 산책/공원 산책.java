class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] result = new int[2];
        
        // 시작 지점 파악하기
        exit_For:
        for(int i=0; i<park.length; i++) {
            for(int j=0; j<park[i].length(); j++) {
                if(park[i].charAt(j) == 'S') {
                    result[0] = i;
                    result[1] = j;
                    break exit_For;
                }
            }
        }
        
        // 방향을 나타내는 델타 값
        int[][] directions = { {0, 1}, {0, -1}, {1, 0}, {-1, 0} };
        String[] dirKeys = { "E", "W", "S", "N" };

        for (String route : routes) {
            String[] move = route.split(" ");
            String dir = move[0];
            int dist = Integer.parseInt(move[1]);
            
            int dx = 0, dy = 0;
            for (int d = 0; d < dirKeys.length; d++) {
                if (dirKeys[d].equals(dir)) {
                    dx = directions[d][0];
                    dy = directions[d][1];
                    break;
                }
            }

            // 이동할 좌표 계산
            int newX = result[1] + dy * dist;
            int newY = result[0] + dx * dist;
            
            // 공원 범위를 벗어나는지 확인
            if (newX < 0 || newX >= park[0].length() || newY < 0 || newY >= park.length) {
                continue;
            }

            // 장애물 확인
            boolean blocked = false;
            for (int step = 1; step <= dist; step++) {
                int intermediateX = result[1] + dy * step;
                int intermediateY = result[0] + dx * step;
                if (park[intermediateY].charAt(intermediateX) == 'X') {
                    blocked = true;
                    break;
                }
            }
            
            // 장애물이 없다면 위치 업데이트
            if (!blocked) {
                result[0] = newY;
                result[1] = newX;
            }
        }
        
        return result;
    }
}