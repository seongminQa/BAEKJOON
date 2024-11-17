class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        String[] binary1 = new String[n];
        String[] binary2 = new String[n];
        
        for(int i=0; i<n; i++) {
            int number1 = arr1[i];
            int number2 = arr2[i];
            StringBuilder sb = new StringBuilder();
            
            for(int j=0; j<n; j++) {
                int rest1 = number1 % 2;
                int rest2 = number2 % 2;
                number1 = number1 / 2;
                number2 = number2 / 2;
                if(rest1 + rest2 >= 1) {
                    sb.insert(0, "#");
                } else {
                    sb.insert(0, " ");
                }
            }
            result[i] = sb.toString();
        }
        
        return result;
    }
}