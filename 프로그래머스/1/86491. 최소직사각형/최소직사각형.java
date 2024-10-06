// 가로길이와 세로길이의 최댓값을 구하면 된다. --> 명함은 눕힐 수도 있기 때문에 명함의 길이기 긴 부분을 '가로'에 몰아준다.
// 1. 가로길이와 세로길이를 비교하여 큰 값을 가로길이로 정한다.
// 2. 이 때, 명함을 눕혀준다 (가로와 세로를 바꿈)
// 3. 가로길이와 세로길이의 최댓값을 비교하여 저장한다.

class Solution {
    public int solution(int[][] sizes) {
        int v = 0;
        int h = 0;
        
        for(int[] val : sizes) {
            if(val[0] > val[1]) {
                if(val[0] > v) v = val[0];
                if(val[1] > h) h = val[1];
            } else {
                if(val[1] > v) v = val[1];
                if(val[0] > h) h = val[0];
            }
        }
        
        System.out.println("v = " + v);
        System.out.println("h = " + h);
        
        return v*h;
    }
}