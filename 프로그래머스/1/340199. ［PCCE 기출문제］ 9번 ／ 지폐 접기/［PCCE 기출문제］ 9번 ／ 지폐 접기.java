class Solution {
    public int solution(int[] wallet, int[] bill) {
        int result = 0;
        int wv = Math.max(wallet[0], wallet[1]);
        int wh = Math.min(wallet[0], wallet[1]);
        int bv = Math.max(bill[0], bill[1]);
        int bh = Math.min(bill[0], bill[1]);

        while(wv < bv || wh < bh) {
            ++result;
            if(bv > bh) {
                bv = bv / 2;
            }
            
            if(bv < bh) {
                int temp = bv;
                bv = bh;
                bh = temp;
            }
        }
        return result;
    }
}