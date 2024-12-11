class Solution {
    public int[] solution(int[] sequence, int k) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int[] result = new int[2];
        
        for(int right=0; right<sequence.length; right++) {
            sum += sequence[right];
            
            while(sum > k && left <= right) {
                sum -= sequence[left++];
            }
            
            if(sum == k) {
                int length = right - left + 1;
                if(length < minLength) {
                    minLength = length;
                    result[0] = left;
                    result[1] = right;
                }
            }
        }
        
        return result;
    }
}