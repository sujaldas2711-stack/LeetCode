package LeetCode;

public class leetcode_76 {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0)
                zero++;
            else if (nums[i]==1)
                one++;
        }
        int i=0;
        while (i<nums.length){
            if (zero>0){
                nums[i]=0;
                zero--;
                i++;
                continue;
            }
            if (one>0){
                nums[i]=1;
                one--;
                i++;
                continue;
            }
            nums[i]=2;
            i++;
        }
    }  
}

