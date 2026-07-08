package LeetCode;

public class leetcode_53 {
    public int maxSubArray(int[] nums) {
        /* Brute force
        int res = nums[0];
        for (int i=0;i<nums.length;i++){
            int sum =0;
            for (int j=i;j<nums.length;j++){
                sum += nums[j];
                res = Math.max(res,sum);
            }
        }
        return res;
        */
        int max= Integer.MIN_VALUE;
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            if (sum > max){
                 max = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return max;

    }
  
}
