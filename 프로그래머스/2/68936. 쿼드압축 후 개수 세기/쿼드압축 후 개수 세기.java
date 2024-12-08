class Solution {
    
    
    public int[] solution(int[][] arr) {
        int[] result = new int[2];
        compress(arr, 0, 0, arr.length, result);
        return result;
    }
    
    // 구역을 나누어주는 메소드?
    private void compress(int[][] arr, int x, int y, int size, int[] result) {
        if(isEqual(arr, x, y, size)) {
            ++result[arr[x][y]];
            return;
        }
        
        int divide = size/2;
        compress(arr, x, y, divide, result);
        compress(arr, x+divide, y, divide, result);
        compress(arr, x, y+divide, divide, result);
        compress(arr, x+divide, y+divide, divide, result);
    }
    
    // 통합
    private boolean isEqual(int[][] arr, int x, int y, int size) {
        int value = arr[x][y];
        
        for(int i=x; i<x+size; i++) {
            for(int j=y; j<y+size; j++) {
                if(arr[i][j] != value) {
                    return false;
                }
            }
        }
        
        return true;
    }
}