class Solution {
    public String solution(int[] food) {
        String result = "";
        
        for(int i=1; i<food.length; i++) {
            if(food[i] / 2 > 0) {
                for(int j=0; j<food[i]/2; j++) {
                    result += String.valueOf(i);
                }
            }
        }
        result += "0";
        
        for(int i=food.length-1; i>0; i--) {
            if(food[i] / 2 > 0) {
                for(int j=0; j<food[i]/2; j++) {
                    result += String.valueOf(i);
                }
            }
        }
        
        System.out.println(result);
        
        return result;
    }
}