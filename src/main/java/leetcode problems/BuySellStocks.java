/**
 * Level: Easy
 * Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Description:
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * <p>
 * Note that you cannot sell a stock before you buy one.
 * <p>
 * Example 1:
 * <p>
 * Input: [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Not 7-1 = 6, as selling price needs to be larger than buying price.
 * <p>
 * Example 2:
 * <p>
 * Input: [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 *
 * @author kaioh
 * @version 2022
 */

public class BuySellStocks {

    /**Determines what the maxProfit is.
     *
     * @param prices integer array
     * @return a number
     */
    public static int maxProfit(final int[] prices) {
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else if (prices[i] - buyPrice > profit) {
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
    }

    /** Drives the main.
     *
     * @param args string
     */
    public static void main(final String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 0, 6, 4}));
        System.out.println(maxProfit(new int[]{4, 3, 2, 1}));

        // edge case!
        System.out.println(maxProfit(new int[]{}));
        System.out.println(maxProfit(new int[]{1}));
    }
}
