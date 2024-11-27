import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        List<String> resultList = new ArrayList<>();
        
        for(String file : files) {
            resultList.add(file);
        }
        
        resultList.sort((o1, o2) -> {
            StringBuilder head1 = new StringBuilder();
            StringBuilder number1 = new StringBuilder();
            StringBuilder head2 = new StringBuilder();
            StringBuilder number2 = new StringBuilder();
            
            boolean headCheck = true;
            
            for(int i=0; i<o1.length(); i++) {
                if((Character.isAlphabetic(o1.charAt(i)) || !Character.isDigit(o1.charAt(i))) && headCheck) {
                    head1.append(o1.charAt(i));
                } else if(Character.isDigit(o1.charAt(i))) {
                    headCheck = false;
                    number1.append(o1.charAt(i));
                } else {
                    break;
                }
            }
            
            headCheck = true;
            
            for(int i=0; i<o2.length(); i++) {
                if((Character.isAlphabetic(o2.charAt(i)) || !Character.isDigit(o2.charAt(i))) && headCheck) {
                    head2.append(o2.charAt(i));
                } else if(Character.isDigit(o2.charAt(i))) {
                    headCheck = false;
                    number2.append(o2.charAt(i));
                } else {
                    break;
                }
            }
            
            int headCompare = head1.toString().compareToIgnoreCase(head2.toString());
            if(headCompare != 0) {
                return headCompare;
            }
            
            int num1 = Integer.parseInt(number1.toString());
            int num2 = Integer.parseInt(number2.toString());
            return Integer.compare(num1, num2);
        });
        
        return resultList.toArray(new String[0]);
    }
}