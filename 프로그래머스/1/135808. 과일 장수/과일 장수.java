import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        List<Integer> list = new ArrayList<>();
        for(int sco : score) {
            list.add(sco);
        }
        Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        
        int totalPrice = 0;
        int price = 0;
        for(int i=0; i<score.length; i++) {
            if((i+1) % m == 0) {
                price = list.get(i);
                totalPrice += price * m;
            }
        }
        
        return totalPrice;
    }
}