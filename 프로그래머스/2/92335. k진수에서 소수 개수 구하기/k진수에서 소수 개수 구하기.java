class Solution {
    public int solution(int n, int k) {
        int result = 0;
        StringBuilder conversion = new StringBuilder();
        
        while(n > 0) {
            int rest = n % k;
            conversion.insert(0, rest);
            n = n / k;
        }
        
        // System.out.println(conversion.toString());
        
        StringBuilder primeCheck = new StringBuilder();
        
        for(int i=0; i<conversion.length(); i++) {
            if(conversion.charAt(i) != '0') {
                primeCheck.append(conversion.charAt(i));
            }
            
            if((conversion.charAt(i) == '0' && primeCheck.length() > 0) 
              || (i == conversion.length()-1 && primeCheck.length() > 0)) {
                // System.out.println("number = " + primeCheck.toString());
                Long number = Long.parseLong(primeCheck.toString());
                boolean check = true;
                
                if(number > 2) {
                    for(long j=2; j<=Math.sqrt(number); j++) {
                        if(number % j == 0) check = false;
                    }
                }
                if(number == 1) check = false;
                
                if(check) {
                    ++result;
                }
                primeCheck.setLength(0);
            }
        }
        
        return result;
    }
}