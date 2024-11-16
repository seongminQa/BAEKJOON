import java.util.*;

class Solution {
    private int maxCnt = 0;
    private boolean[] visited;
    
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        
        return maxCnt;
    }
    
    private void dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        maxCnt = Math.max(maxCnt, count);
        
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(k - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}