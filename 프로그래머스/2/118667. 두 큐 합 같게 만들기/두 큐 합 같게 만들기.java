class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int len = queue1.length;
        int[] combine = new int[len*2];
        long sum1 = 0;
        long sum2 = 0;
        long totalSum = 0;
        
        for(int i=0; i<len; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            combine[i] = queue1[i];
            combine[i+len] = queue2[i];
        }
        totalSum = sum1 + sum2;
        
        long target = totalSum / 2;
        int left = 0;
        int right = len;
        long currentSum = sum1;
        int count = 0;
        
        while(left < len*2 && right < len*2) {
            if(currentSum == target) {
                return count;
            }
            if(currentSum < target) {
                currentSum += combine[right++];
            } else {
                currentSum -= combine[left++];
            }
            ++count;
            if(left >= len*2 || right >= len*2) return -1;
        }

        return count;
    }
}