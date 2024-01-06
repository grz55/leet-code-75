package pl.grz55.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    @Test
    void testMaxProfitForIncreasingPrices() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {7, 1, 5, 3, 6, 4};

        assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices2() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {7, 10, 13, 4, 6};

        assertEquals(6, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices3() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {1, 5, 10, 6, 14, 5, 2};

        assertEquals(13, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices4() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {7, 10, 13, 4, 6};

        assertEquals(6, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices5() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {5, 15, 26, 20, 22, 14};

        assertEquals(21, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices6() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {1, 100, 1, 100, 1};

        assertEquals(99, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices7() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {1, 100, 1, 100, 1, 101};

        assertEquals(100, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices8() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] increasingPrices = {1, 2};

        assertEquals(1, bestTimeToBuyAndSellStock.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForConstantPrice() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] input = {8, 8, 8, 8};

        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(input));
    }

    @Test
    void testMaxProfitForDecreasingPrices() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] decreasingPricesInput1 = {7, 6, 4, 3, 1};
        int[] decreasingPricesInput2 = {10, 3, 1, 0};
        int[] decreasingPricesInput3 = {7, 1};
        int[] decreasingPricesInput4 = {100, 50, 25, 24, 23, 22, 1, 0};

        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(decreasingPricesInput1));
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(decreasingPricesInput2));
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(decreasingPricesInput3));
        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(decreasingPricesInput4));
    }

    @Test
    void testMaxProfitForOneDayLongTimePeriod() {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

        int[] oneDayPeriodInput = {13};

        assertEquals(0, bestTimeToBuyAndSellStock.maxProfit(oneDayPeriodInput));
    }
}
