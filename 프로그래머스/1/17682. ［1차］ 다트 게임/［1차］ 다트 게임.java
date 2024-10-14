class Solution {
    public int solution(String dartResult) {
        int result = 0;
        double[] storage = new double[3];
        int idx = 0;
        
        for(int i=0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if(c == 'S') {
                if(i >= 2) {
                    if(dartResult.charAt(i-2) == '1') {
                        storage[idx] = Math.pow(10, 1);
                        ++idx;
                    } else {
                        storage[idx] = Math.pow(dartResult.charAt(i-1)-'0', 1);
                        ++idx;
                    }
                } else {
                    storage[idx] = Math.pow(dartResult.charAt(i-1)-'0', 1);
                        ++idx;
                }
            } else if(c == 'D') {
                if(i >= 2) {
                    if(dartResult.charAt(i-2) == '1') {
                        storage[idx] = Math.pow(10, 2);
                        ++idx;
                    } else {
                        storage[idx] = Math.pow(dartResult.charAt(i-1)-'0', 2);
                        ++idx;
                    }
                } else {
                    storage[idx] = Math.pow(dartResult.charAt(i-1)-'0', 2);
                        ++idx;
                }
            } else if(c == 'T') {
                if(i >= 2) {
                    if(dartResult.charAt(i-2) == '1') {
                        storage[idx] = Math.pow(10, 3);
                        ++idx;
                    } else {
                        storage[idx] = Math.pow(dartResult.charAt(i-1)-'0', 3);
                        ++idx;
                    }
                } else {
                    storage[idx] = Math.pow(dartResult.charAt(i-1)-'0', 3);
                        ++idx;
                }
            }
            
            if(c == '*') {
                System.out.println("idx = " + idx);
                if(idx == 1) {
                    storage[idx-1] = storage[idx-1]*2;
                } else {
                    storage[idx-2] = storage[idx-2]*2;
                    storage[idx-1] = storage[idx-1]*2;
                }
            } else if(c == '#') {
                System.out.println("idx = " + idx);
                storage[idx-1] = storage[idx-1]*(-1);
            }
            
        }
        
        for(double num : storage) {
            // System.out.println(num);
            result += num;
        }

        return result;
    }
}