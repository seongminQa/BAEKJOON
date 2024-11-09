import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        // map의 행과 열
        int n = maps.length; // 행
        int m = maps[0].length; // 열
        
        // 상 하 좌 우 파악
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        // BFS를 사용하기 위해 Queue 자료구조 이용
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0,0});
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            
            // 목표 거리에 도달하면 값 반환
            if(x == n-1 && y == m-1) return maps[x][y];
            
            // 상하좌우 확인
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    // 벽이 아니고 아직 방문하지 않았을 경우
                    if(maps[nx][ny] == 1) {
                        maps[nx][ny] = maps[x][y] + 1; // 거리를 갱신
                        q.offer(new int[] {nx, ny});
                    }
                }
            }
        }
        
        return -1;
    }
}