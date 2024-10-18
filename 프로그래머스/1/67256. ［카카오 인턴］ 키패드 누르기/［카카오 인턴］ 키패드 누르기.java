class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[] left = {3, 0}; // '*' 시작 위치
        int[] right = {3, 0}; // '#' 시작 위치
        
        int[][] keypad = {
            {3, 1}, // -> 0의 위치
            {0, 0}, {0, 1}, {0, 2}, // -> 1, 2, 3 위치
            {1, 0}, {1, 1}, {1, 2}, // -> 4, 5, 6 위치
            {2, 0}, {2, 1}, {2, 2} // -> 7, 8, 9 위치
        };
        
        for(int num : numbers) {
            if(num == 1 || num == 4 || num == 7) {
                sb.append("L");
                left = keypad[num];
            } else if(num == 3 || num == 6 || num == 9) {
                sb.append("R");
                right = keypad[num];
            } else {
                int lDis = Math.abs(left[0] - keypad[num][0]) + Math.abs(left[1] - keypad[num][1]);
                int rDis = Math.abs(right[0] - keypad[num][0]) + Math.abs(right[1] - keypad[num][1]);
                
                if(lDis > rDis) {
                    sb.append("R");
                    right = keypad[num];
                } else if(lDis < rDis) {
                    sb.append("L");
                    left = keypad[num];
                } else {
                    if(hand.equals("right")) {
                        sb.append("R");
                        right = keypad[num];
                    } else {
                        sb.append("L");
                        left = keypad[num];
                    }
                }
            }
        }
        
        return sb.toString();
    }
}