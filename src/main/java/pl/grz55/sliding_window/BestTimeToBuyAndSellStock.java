package pl.grz55.sliding_window;

public class BestTimeToBuyAndSellStock {

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
        if (prices.length == 1) {
            return 0;
        }
        int maxIncrease = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int selectedPrice = prices[i];
            int maxAfterSelected = findMaxAfterSelected(i, prices);
            int priceIncrease = maxAfterSelected - selectedPrice;
            if (priceIncrease > maxIncrease) {
                maxIncrease = priceIncrease;
            }
        }
        return maxIncrease;
    }

    private int findMaxAfterSelected(int i, int[] prices) {
        int max = prices[i + 1];
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] > max) {
                max = prices[j];
            }
        }
        return max;
    }
}
