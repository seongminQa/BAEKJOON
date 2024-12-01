class Solution {
    public int solution(String dartResult) {
        double[] score = new double[3];
        int idx = 0;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(c != 'S' && c != 'D' && c != 'T' && c != '*' && c != '#') {
                sb.append(c);
            }
            // System.out.println(sb.toString());
            
            if(c == 'S') {
                score[idx] = Math.pow(Integer.parseInt(sb.toString()), 1);
                sb.setLength(0);
                ++idx;
            } else if(c == 'D') {
                score[idx] = Math.pow(Integer.parseInt(sb.toString()), 2);
                sb.setLength(0);
                ++idx;
            } else if(c == 'T') {
                score[idx] = Math.pow(Integer.parseInt(sb.toString()), 3);
                sb.setLength(0);
                ++idx;
            }
            
            if(c == '*') {
                if(idx > 1) {
                    score[idx-2] *= 2;
                    score[idx-1] *= 2;
                } else {
                    score[idx-1] *= 2;
                }
            } else if(c == '#') {
                score[idx-1] *= -1;
            }
        }
        
        return (int) (score[0] + score[1] + score[2]);
    }
}