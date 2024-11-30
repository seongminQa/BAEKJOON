import java.util.*;

class Solution {
    public int solution(int m, int n, String[] board) {
        // board에 들어있는 블록을 char 이중 배열로 바꿈
        char[][] map = new char[m][n];
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                map[i][j] = board[i].charAt(j);
            }
        }
        
        // 총 제거 수
        int totalRemoveBlock = 0;
        boolean check = false;
        
        while(!check) {
            boolean[][] removeBlock = new boolean[m][n];
            check = true;
            
            // 2x2 블록 확인
            for(int i=0; i<m-1; i++) {
                for(int j=0; j<n-1; j++) {
                    char current = map[i][j];
                    
                    if(current != ' ' && current == map[i][j+1] && current == map[i+1][j] 
                       && current == map[i+1][j+1]) {
                        removeBlock[i][j] = true;
                        removeBlock[i][j+1] = true;
                        removeBlock[i+1][j] = true;
                        removeBlock[i+1][j+1] = true;
                        check = false;
                    }
                }
            }
            
            // 2x2 블록 제거 후 갯수 확인
            int removeCnt = 0;
            for(int i=0; i<m; i++) {
                for(int j=0; j<n; j++) {
                    if(removeBlock[i][j]) {
                        map[i][j] = ' ';
                        ++removeCnt;
                    }
                }
            }
            
            totalRemoveBlock += removeCnt;
            
            // 블록 재정렬
            for(int i=0; i<n; i++) {
                int emptyRow = m - 1;
                for(int j=m-1; j>=0; j--) {
                    if(map[j][i] != ' ') {
                        char temp = map[j][i];
                        map[j][i] = ' ';
                        map[emptyRow--][i] = temp;
                    }
                }
                
            }
            
        }
        
        return totalRemoveBlock;
    }
}