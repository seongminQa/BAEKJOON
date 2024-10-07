class Solution {
    public int solution(String s) {
        int result = 0;
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<number.length; i++){
            if(s.contains(number[i])) s = s.replace(number[i], i+"");
        }
        
        result = Integer.parseInt(s);
        
        return result;
    }
}