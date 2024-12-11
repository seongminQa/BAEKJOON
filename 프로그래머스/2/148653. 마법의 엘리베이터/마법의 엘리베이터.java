class Solution {
    public int solution(int storey) {
        int result = 0;
        
        while(storey > 0) {
            int temp = storey % 10;
            storey /= 10;
            
            if(10 < 2*temp) {
                result += 10-temp;
                storey += 1;
            } else if(10 > 2*temp) {
                result += temp;
            } else if(temp == 5) {
                if(storey % 10 >= 5) {
                    result += 10-temp;
                    storey += 1;
                } else {
                    result += temp;
                }
            }
        }
        
        return result;
    }
}