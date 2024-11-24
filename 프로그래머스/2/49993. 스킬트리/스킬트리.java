class Solution {
    public int solution(String skill, String[] skill_trees) {
        int result = 0;

        for(String skill_tree : skill_trees) {
            boolean check = true;
            int idx = 0;
            
            for(char c : skill_tree.toCharArray()) {
                int requireIdx = skill.indexOf(c);
                
                if(requireIdx == -1) continue;
                
                if(requireIdx == idx) ++idx;
                else {
                    check = false;
                    break;
                }
            }
            
            if(check) {
                ++result;
                // System.out.println(skill_tree + " -> 통과");
            }
        }
        return result;
    }
}