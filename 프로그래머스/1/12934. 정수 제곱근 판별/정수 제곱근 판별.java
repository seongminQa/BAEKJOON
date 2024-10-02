class Solution {
    public long solution(long n) {
        long answer = 0;
        double num = Math.sqrt(n) * 10;
        
        System.out.println(num);
        System.out.println((int) (num / 10 + 1));
        System.out.println((int) Math.pow((num / 10 + 1), 2));
        
        if(num % 10 == 0) return (long) Math.pow((num / 10 + 1), 2);
        else return -1;
    }
}