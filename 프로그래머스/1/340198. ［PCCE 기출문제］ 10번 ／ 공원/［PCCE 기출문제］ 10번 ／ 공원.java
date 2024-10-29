import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int result = -1;
        
        // 지민이가 가진 돗자리의 크기를 내림차 순으로 정렬 -> 깔 수 있는 가장 큰 돗자리를 찾는 문제이기 때문.
        Arrays.sort(mats);
        
        // 가지고 있는 돗자리의 최대 크기부터 반복하여 검사
        for(int n=mats.length-1; n>=0; n--) {
            int matSize = mats[n];
            
            // 공원의 크기 검사
            int rows = park.length;
            int cols = park[0].length;
            
            // 공원의 크기에서 돗자리만큼 자리가 있는지 검사하려는 2중 for문
            for(int i=0; i<=rows-matSize; i++) {
                for(int j=0; j<=cols-matSize; j++) {
                    
                    // 검사를 시작하는 위치 (i,j) 에서부터 빈자리가 어디까지인지 확인하려는 2중 for문
                    boolean canPlace = true;
                    for(int k=i; k<i+matSize; k++) {
                        for(int g=j; g<j+matSize; g++) {
                            // 돗자리 크기만큼 반복하는데, "-1"이 아니라면 중단
                            if(!park[k][g].equals("-1")) {
                                canPlace = false;
                                break;
                            }
                        }
                        if(!canPlace) break;
                    }
                    
                    if(canPlace) {
                        return matSize;
                    }
                }
            }
        }
        
        return result;
    }
}