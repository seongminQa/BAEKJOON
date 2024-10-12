class Solution {
    public int solution(int n, int m, int[] section) {
        int len = section.length;
        if(m == 1) return len;
        
        int[] wall = new int[n];
        int result = 0;
        
        for(int i=0; i<len; i++) {
            wall[section[i]-1] = 1;
        }
        
        // for(int i=0; i<n; i++) {
        //     System.out.print(wall[i] + " ");
        // }
        // System.out.println();
        
        for(int i=0; i<n; i++) {
            if(wall[i] > 0) {
                if(i+m <= n) {
                    for(int j=i; j<i+m; j++){
                        wall[j] = 0;
                    }
                } else {
                    for(int j=i; j<n; j++){
                        wall[j] = 0;
                    }
                }
                result++;
            }
        }
        
        // for(int i=0; i<n; i++) {
        //     System.out.print(wall[i] + " ");
        // }
        
        return result;
    }
}