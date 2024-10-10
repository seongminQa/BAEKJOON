import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int cnt = nums.length / 2;
        int max = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(set.size() < cnt) set.add(nums[i]);
        }
        
        max = set.size();
        
        return max;
    }
}