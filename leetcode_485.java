package LeetCode;
public class leetcode_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int start = 0;
        int temp = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == 1) {
                temp ++;
            }else {
                start = i;
                temp = 0;
            }
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        leetcode_485 solution = new leetcode_485();    
        int[] nums = {1,1,0,1,1,1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}