class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        // bandage는 [시전 시간, 초당 회복량, 추가 회복량]
        // attacks[i]는 [공격 시간, 피해량]
        // health는 최대 체력

        int time = 0;
        int reco_time = 0;
        int end_time = attacks[attacks.length-1][0];
        int max_health = health;
        int idx = 0;
        
        while(idx < attacks.length) {
            int attack_time = attacks[idx][0];
            int damage = attacks[idx][1];
            
            ++time;
            ++reco_time;
            // recovery += bandage[1];
            
            // System.out.println("현재 시간 : " + time);

            if(time == attack_time) {
                health -= damage;
                // System.out.println("몬스터에게 데미지" + damage + " 를 받아 체력 : " + health);
                if(health <= 0) return -1;
                reco_time = 0;
                ++idx;
                continue;
            }
            
            if(health + bandage[1] <= max_health) {
                health += bandage[1];
                // System.out.println("초당 회복 중 " + bandage[1] + "만큼 회복하여 체력 : " + health);
            } else {
                health = max_health;
                // System.out.println("초당 회복 중 " + bandage[1] + "만큼 회복하여 체력 : " + health);
            }
            
            if(reco_time == bandage[0]) {
                if(health + bandage[2] <= max_health) {
                    health += bandage[2];
                } else {
                    health = max_health;
                }
                
                // System.out.println("치료 성공! " + bandage[2] + "만큼 보너스 회복하여 체력 : " + health);
                
                reco_time = 0;
            }
            
            // if(time == end_time) break;
        }

        return health;
    }
}