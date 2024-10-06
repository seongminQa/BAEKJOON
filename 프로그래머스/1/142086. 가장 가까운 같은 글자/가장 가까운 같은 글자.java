class Solution {
    public int[] solution(String s) {
        int[] result = new int[s.length()];
        String word = "";
        
        for(int i=0; i<s.length(); i++) {
            word += s.charAt(i);
            
            if(i == 0) result[i] = -1;
            
            if(word.indexOf(s.charAt(i) + "") == i) 
                result[i] = -1;
            else {
                result[i] = i - word.indexOf(s.charAt(i) + "");
                word = word.substring(0, word.indexOf(s.charAt(i) + "")) + "0" 
                    + word.substring(word.indexOf(s.charAt(i) + "")+1);
            }
        }
        
        return result;
    }
}