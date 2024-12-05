class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int hit = 0;
        int zeroCnt = 0;
        
        for(int number : lottos) {
            if(number == 0) {
                ++zeroCnt;
            } else {
                for(int win_num : win_nums) {
                    if(number == win_num) {
                        ++hit;
                        break;
                    }
                }
            }
        }
        
        int max_match = 0;
        int min_match = 0;
        
        if(zeroCnt == 6) {
            max_match = 6;
            min_match = 1;
        } else if(hit == 0) {
            max_match = 1;
            min_match = 1;
        } else {
            max_match = hit + zeroCnt;
            min_match = hit;
        }
        
        return new int[] {7-max_match, 7-min_match};
    }
}