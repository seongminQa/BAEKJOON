import java.util.*;

class Solution {
    public int solution(String numbers) {
        int result = 0;
        Set<Integer> uniqueNumbers = new HashSet<>();
        generateCombinations("", numbers, uniqueNumbers);
        
        for(int number : uniqueNumbers) {
            if(isPrime(number)) {
                ++result;
            }
        }
        
        return result;
    }
    
    // 모든 수 조합 후 확인
    private void generateCombinations(String current, String remaining, Set<Integer> uniqueNumbers) {
        if(current.length() > 0) {
            uniqueNumbers.add(Integer.parseInt(current));
        }
        
        for(int i=0; i<remaining.length(); i++) {
            generateCombinations(current + remaining.charAt(i),
                                remaining.substring(0,i) + remaining.substring(i+1),
                                uniqueNumbers);
        }
    }
    
    // 소수 판별
    private boolean isPrime(int number) {
        if(number <= 1) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        
        for(int i=2; i<=Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        
        return true;
    }
}