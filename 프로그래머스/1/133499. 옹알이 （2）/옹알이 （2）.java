class Solution {
    private String[] speak = {"aya", "ye", "woo", "ma"};
    
    public int solution(String[] babbling) {
        int result = 0;
        
        for(String word : babbling) {
            String prev = "";
            boolean valid = true;
            
            while(valid && word.length() > 0) {
                boolean find = false;
                
                for(String str : speak) {
                    if(word.startsWith(str)) {
                        if(prev.equals(str)) {
                            valid = false;
                            break;
                        }
                        prev = str;
                        word = word.substring(str.length());
                        find = true;
                        break;
                    }
                }
                if(!find) valid = false;
            }
            if(valid) ++result;
        }
        
        return result;
    }
}