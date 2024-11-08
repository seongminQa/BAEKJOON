import java.util.*;

class Solution
{
    public int solution(int n, int a, int b)
    {
        int result = 0;
        List<Integer> players = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            players.add(i);
        }

        while(true) {
            ++result;
            List<Integer> nextRound = new ArrayList<>();
            
            for(int i=0; i<players.size(); i+=2) {
                int player1 = players.get(i);
                int player2 = players.get(i+1);
                
                if((player1 == a && player2 == b) || (player1 == b && player2 == a))
                    return result;
                
                if(player1 == a || player1 == b) {
                    nextRound.add(player1);
                } else {
                    nextRound.add(player2);
                }
            }
            
            players = nextRound;
        }
    }
}