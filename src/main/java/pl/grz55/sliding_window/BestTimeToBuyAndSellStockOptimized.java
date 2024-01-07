package pl.grz55.sliding_window;

public class BestTimeToBuyAndSellStockOptimized {

    //    https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

    //    You are given an array prices where prices[i] is
    //    the price of a given stock on the ith day.
    //
    //    You want to maximize your profit by choosing a single day
    //    to buy one stock and choosing a different day in the future to sell that stock.
    //
    //    Return the maximum profit you can achieve from this transaction.
    //    If you cannot achieve any profit, return 0.

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
