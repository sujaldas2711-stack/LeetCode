package LeetCode;
public class leetcode_26_remove_dup_from_arr {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 1;
        for (int curr = 1; curr < nums.length; curr++) {
            if (nums[curr] != nums[left - 1]) {
                nums[left] = nums[curr];
                left++;
            }
        }
        return left;
    }
    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        leetcode_26_remove_dup_from_arr obj = new leetcode_26_remove_dup_from_arr();

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}