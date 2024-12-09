import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int currentWeight = 0;
        int time = 0;
        
        for(int truck : truck_weights) {
            while(true) {
                if(bridge.isEmpty()) {
                    bridge.add(truck);
                    currentWeight += truck;
                    ++time;
                    break;
                } else if(bridge.size() == bridge_length) {
                    currentWeight -= bridge.poll();
                } else {
                    if(currentWeight + truck <= weight) {
                        bridge.add(truck);
                        currentWeight += truck;
                        ++time;
                        break;
                    } else {
                        bridge.add(0);
                        ++time;
                    }
                }
            }
        }
        
        return time + bridge_length;
    }
}