package LeetCode;

public class leetcode_121 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int initial = prices[0];
        for (int i = 0; i < prices.length; i++){
            if (initial <= prices[i]){
                profit = Math.max(prices[i] - initial,profit);
            }
            else{
                initial = prices[i];
            }
        }
        return profit;
    }

}
