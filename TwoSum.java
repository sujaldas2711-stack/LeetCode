package LeetCode;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> blah = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int val = target - nums[i];

        
            if (blah.containsKey(val)){
                 int[] arr = {blah.get(val),i};
                return arr;
            }
            blah.put(nums[i],i);
        }
        int[] arr = {-1,-1};
        return arr;

    }

}
