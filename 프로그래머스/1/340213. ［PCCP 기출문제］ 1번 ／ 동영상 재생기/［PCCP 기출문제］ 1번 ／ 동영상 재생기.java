class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 시간 변환 및 초기화
        String[] video_len_div = video_len.split(":");
        int video_time = Integer.parseInt(video_len_div[0]) * 60 + Integer.parseInt(video_len_div[1]);

        String[] pos_div = pos.split(":");
        int currentTime = Integer.parseInt(pos_div[0]) * 60 + Integer.parseInt(pos_div[1]);

        String[] op_start_div = op_start.split(":");
        int op_start_time = Integer.parseInt(op_start_div[0]) * 60 + Integer.parseInt(op_start_div[1]);

        String[] op_end_div = op_end.split(":");
        int op_end_time = Integer.parseInt(op_end_div[0]) * 60 + Integer.parseInt(op_end_div[1]);

        // 명령어 처리
        for (String command : commands) {
            // 오프닝 건너뛰기
            if (currentTime >= op_start_time && currentTime <= op_end_time) {
                currentTime = op_end_time;
            }
            
            if (command.equals("prev")) {
                currentTime -= 10;
                if (currentTime < 0) currentTime = 0;
            } else if (command.equals("next")) {
                currentTime += 10;
                if (currentTime >= video_time) currentTime = video_time;
            }
            // System.out.println(currentTime/60 + " : " + currentTime%60);
        }

        // 오프닝 건너뛰기
        if (currentTime >= op_start_time && currentTime <= op_end_time) {
            currentTime = op_end_time;
        }

        // 최종 위치 계산
        int minutes = currentTime / 60;
        int seconds = currentTime % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
