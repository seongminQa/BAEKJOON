class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        int[] result = new int[arr.length-1];
        
        // 1. 내림차순 정렬하여 마지막 요소 빼는 방식으로 풀기 -> (X) 단순히 배열을 정렬하는 문제가 아님
        // '버블 정렬', '선택 정렬', '삽입 정렬'을 한번씩 연습해보았다.
        // 이 중 '삽입 정렬'이 가장 빠르기 때문에 '삽입 정렬'을 이용하여 풀어보자.
        /*
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            for(int j=i-1; j>=0; j--) {
                if(arr[j] < temp) {
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        */
        
        // 확인해보기
        // for(int i=0; i<arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // 결과를 대입
        // for(int i=0; i<arr.length-1; i++) {
        //     result[i] = arr[i];
        // }
        
        // 2. 배열에 들어있는 값 중 제일 최솟값을 찾아 나머지 요소들만 복사하기
        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        
        // 최솟값을 갖는 인덱스를 찾음
        for(int i=0; i<arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                minIdx = i;
            }
        }
        
        // 최솟값을 갖는 인덱스를 제외하고 result에 대입
        int idx = 0;
        for(int i=0; i<arr.length; i++) {
            if(i != minIdx) {
                result[idx] = arr[i];
                ++idx;
            }
        }
        
        return result;
    }
}