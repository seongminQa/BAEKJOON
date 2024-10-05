class Solution {
    public String solution(String s) {
        String result = "";
//         String[] word = s.split(" ");
        
//         System.out.println(word.length);
        
//         for(int i=0; i<word.length; i++) {
//             if(i > 0) result += " ";
//             for(int j=0; j<word[i].length(); j++){
//                 if(j % 2 == 0) result += word[i].substring(j,j+1).toUpperCase();
//                 else result += word[i].substring(j,j+1).toLowerCase();
//             }
//         }
        
        boolean check = true;
        
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                result += " ";
                check = true;
                continue;
            }
            
            if(check) {
                result += Character.toString(c).toUpperCase();
            } else {
                result += Character.toString(c).toLowerCase();
            }
            
            check = !check;
        }
        
        System.out.println(result);
        
        return result;
    }
}