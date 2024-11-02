import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int result = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<B.length; i++) {
            result += A[i]*B[B.length-1-i];
        }

        return result;
    }
}