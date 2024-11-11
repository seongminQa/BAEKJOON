class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int)(right-left+1);
        int arry[] = new int[len];
        int share = 0;
        int remainder = 0;
        int idx = 0;
        
        while(left <= right) {
            share = (int)(left / (long)n);
            remainder = (int)(left % (long)n);
            int value = Math.max(share, remainder) + 1;
            arry[idx] = value;
            ++idx;
            ++left;
        }
        
        return arry;
    }
}