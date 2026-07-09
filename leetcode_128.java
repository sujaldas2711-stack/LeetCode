package LeetCode;
class Solution {
    public int longestConsecutive(int[] nums) {
       
        Set<Integer> map = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int streak = 0;
        int max =0;
        for (int i:map){
            if (!map.contains(i-1)){
                streak = 1;
                while (map.contains(i+1)){
                    streak++;
                    i++;
                }
            }
            max = Math.max(max,streak);
        }
        return max;    
    }
}