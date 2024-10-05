class Solution {
    public long solution(int n) {
        long result = 0;
        int cnt = 0;
        int temp = n;
        
        while(true) {
            if(temp / 3 >= 1) {
                ++cnt;
                temp = temp / 3;
            }
            else break;
        }
        
        String formation = "";
        
        for(int i=0; i<cnt; i++) {
            formation += (n%3) + "";
            n = n/3;
        }
        
        formation += n + "";

        System.out.println(cnt + 1);
        System.out.println(temp % 3);
        System.out.println(formation);
        
        for(int i=0; i<formation.length(); i++) {
            result += 
                Math.pow(3,i) * (formation.charAt(formation.length()-1-i) - '0');
        }
        
        return result;
    }
}