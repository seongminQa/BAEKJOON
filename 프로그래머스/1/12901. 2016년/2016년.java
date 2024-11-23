class Solution {
    public String solution(int a, int b) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int totalDay = 0;
        
        for(int i=0; i<a-1; i++) {
            totalDay += months[i];
        }
        System.out.println(totalDay);
        totalDay += b - 1;
        System.out.println(totalDay);
        
        return String.valueOf(days[totalDay%7]);
    }
}