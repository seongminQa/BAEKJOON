import java.util.Arrays;

class Solution {
    public String solution(String s) {
//         // 정렬로 풀기
//         String answer = "";
//         char max = ' ';
//         int len = s.length();
        
//         for(int i=0; i<len; i++) {
//             for(int j=1; j<s.length(); j++) {
//                 if(s.chatAt(i) < s.charAt(j)) {
//                     max = s.charAt(j);
//                     s.replace(s.charAt(j), "0");
//             }
//             answer += max + "";
//         }
        
//         System.out.println(answer);
        
//         return answer;
        
        String[] pro = s.split("");
        System.out.println(Arrays.toString(pro));
        Arrays.sort(pro);
        System.out.println(Arrays.toString(pro));
        
        String result = "";
        
        for(int i=pro.length-1; i>=0; i--) {
            result += pro[i];
        }
        
        return result;
        
    }
}