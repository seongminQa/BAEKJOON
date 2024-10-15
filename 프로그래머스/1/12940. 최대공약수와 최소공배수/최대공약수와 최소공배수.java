class Solution {
    public int[] solution(int n, int m) {
        // n을 큰 수로 두고 계산할 것이다.
        int temp = 0;
        if(n < m) {
            temp = n;
            n = m;
            m = temp;
        }
        
        // 유클리드 호제법을 통해 최대공약수를 구한다. (원본 n, m 보존)
        int a = n;
        int b = m;
        int r = 0;
        
        int cnt = 0; // 반복 횟수 기록
        
        while(true) {
            // 유클리드 호제법 적용
            r = a % b;
            a = b;
            b = r;
            cnt++;
            if(b == 0) break;
        }
        
        System.out.println("반복 횟수 : " + cnt);
        System.out.println("최대공약수 : " + a);
        System.out.println("최소공배수 : " + (a*n/a*m/a));
        
        return new int[] {a, (a*n/a*m/a)};
    }
}