class Solution {
    public int solution(int[] nums) {
        int result = 0;
        int len = nums.length;
        
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                for(int k=j+1; k<len; k++) {
                    int number = nums[i]+nums[j]+nums[k];
                    boolean check = true;
                    for(int num=2; num<=Math.sqrt(number); num++) {
                        if(number % num == 0) check = false;
                    }
                    if(check) ++result;
                }
            }
        }
        
        return result;
    }
}