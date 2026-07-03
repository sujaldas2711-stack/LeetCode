public class maximum_element_after_decreasing_and_rearranging {
    
}
class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int[] counts = new int[arr.length+1];
        for (int j=0;j<arr.length;j++){
            counts[Math.min(arr[j],arr.length)]++;
        }
        int ans =1;
        for (int i=2;i<=arr.length;i++){
            ans = Math.min(ans+counts[i],i);
        }
        return ans;
    }
}