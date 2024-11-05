class Solution {
    public int[] solution(int brown, int yellow) {
        // x * y = brown + yellow
        // 가로와 세로의 길이는 총 크기의 약수
        // 하지만 총 크기의 절반보다는 작다
        int total = brown + yellow;
        
        // 노란색 격자 수 -> (x-2) * (y-2)
        
        for(int height=3; height<=total/2; height++) {
            if(total % height == 0) {
                int width = total / height;
                
                if((width-2) * (height-2) == yellow) {
                    return new int[] {width, height};
                }
            }
        }
        
        
        return new int[] {};
    }
}