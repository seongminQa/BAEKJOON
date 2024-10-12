class Solution {
    public int solution(int[] nums) {
        int result = 0;
        int len = nums.length;

        for(int i=0; i<len-2; i++) {
            int value = 0;
            for(int j=1+i; j<len-1; j++) {
                for(int k=1+j; k<len; k++){
                    value = nums[i] + nums[j] + nums[k];
                    // System.out.println("i = " + i + " j = " + j + " k = " + k);
                    // System.out.println(nums[i] + "+" + nums[j] + "+" + nums[k]);
                    // System.out.println("value = " + value);
                    // System.out.println("소수 판별 시작");
                    boolean check = true;
                    for(int v=2; v<=Math.sqrt(value); v++) {
                        // System.out.println("v = " + v + " value = " + value + " value % v = " + value % v);
                        if(value % v == 0) check = false;
                    }
                    // System.out.println("check = " + check);
                    if(check) result++;
                }
            }
        }
        return result;
    }
}