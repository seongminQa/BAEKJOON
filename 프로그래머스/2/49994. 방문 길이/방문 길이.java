import java.util.*;

class Solution {
    public int solution(String dirs) {
        // 방문할 경로를 저장
        Set<String> visitedPaths = new HashSet<>();
        int x = 5, y = 5;
        int[][] directions = {{0,1}, {0,-1}, {-1,0}, {1,0}};
        char[] moves = {'U', 'D', 'L', 'R'};
        
        for(char dir : dirs.toCharArray()) {
            int directionIndex = 0;
            for(int i=0; i<moves.length; i++) {
                if(moves[i] == dir) {
                    directionIndex = i;
                    break;
                }
            }
            
            int nx = x + directions[directionIndex][0];
            int ny = y + directions[directionIndex][1];
            
            if(nx >= 0 && nx <= 10 && ny >=0 && ny <= 10) {
                String path1 = x + "," + y + "->" + nx + "," + ny;
                String path2 = nx + "," + ny + "->" + x + "," + y;
                
                // System.out.println(path1);
                // System.out.println(path2);
                
                if(!visitedPaths.contains(path1)) {
                    visitedPaths.add(path1);
                    visitedPaths.add(path2);
                }
                
                x = nx;
                y = ny;
            }
        }
        
        return visitedPaths.size() / 2;
    }
}