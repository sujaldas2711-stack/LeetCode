package LeetCode;
public class leetcode_136 {

}
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        /* USing HAshmap

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i:map.keySet()){
            if (map.get(i)==1){
                return i;
            }
        }return -1;
        */

        // Using XOR, Important for bit manipulation.
        int res = 0;
        for (int i:nums){
            res ^= i;
        }
        return res;
    }
}