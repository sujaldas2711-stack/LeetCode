package LeetCode;

public class leetcode_2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < n;i++){
            if (nums[i]<0)
                neg[minus++]=nums[i];
            else
                pos[plus++]=nums[i];
        }
        plus = minus = 0;
        for (int i=0;i<n;i+=2){
            nums[i]=pos[plus++];
            nums[i+1]=neg[minus++];
        }
        return nums;
    }
}