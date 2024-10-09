class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        
        for(int i=0; i<n; i++) {
            String a = "";
            String b = "";
            String c = "";
            
            while(arr1[i] >= 1) {
                if(arr1[i] % 2 == 1) a = "#" + a;
                else a = " " + a;
                arr1[i] = arr1[i] / 2;
            }
            if(a.length() < n) {
                int aLeng = a.length();
                for(int k=0; k<n-aLeng; k++) a = " " + a;
            } 
            
            while(arr2[i] >= 1) {
                if(arr2[i] % 2 == 1) b = "#" + b;
                if(arr2[i] % 2 == 0) b = " " + b;
                arr2[i] = arr2[i] / 2;
            }
            if(b.length() < n) {
                int bLeng = b.length();
                for(int k=0; k<n-bLeng; k++) b = " " + b;
            }
            
            for(int j=0; j<n; j++) {
                if(a.charAt(j) == '#' || b.charAt(j) == '#') c += "#";
                else c += " ";
            }
            result[i] = c;
        }
        
        return result;
    }
}