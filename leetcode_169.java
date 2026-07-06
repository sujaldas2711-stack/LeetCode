package LeetCode;

import java.util.HashMap;

// Using HashMap to find the majority element in an array
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i: map.keySet()){
            if (map.get(i)> (nums.length/2))
                 return i;
        }
        return -1;
    }
}

// Usinbg Boyer-Moore Voting Algorithm to find the majority element in an array

class Solution2{
    public int majorityElement(int[] nums) {
        int count =0;
        int candidate =0;
        for (int num: nums){
            if (count==0 ){
                candidate = num;
            }
            if (num == candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
                