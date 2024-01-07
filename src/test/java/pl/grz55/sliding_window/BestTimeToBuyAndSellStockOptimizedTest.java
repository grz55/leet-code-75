package pl.grz55.sliding_window;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockOptimizedTest {

    @Test
    void testMaxProfitForIncreasingPrices() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {7, 1, 5, 3, 6, 4};

        assertEquals(5, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices2() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {7, 10, 13, 4, 6};

        assertEquals(6, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices3() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {1, 5, 10, 6, 14, 5, 2};

        assertEquals(13, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices4() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {7, 10, 13, 4, 6};

        assertEquals(6, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices5() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {5, 15, 26, 20, 22, 14};

        assertEquals(21, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices6() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {1, 100, 1, 100, 1};

        assertEquals(99, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices7() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {1, 100, 1, 100, 1, 101};

        assertEquals(100, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForIncreasingPrices8() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] increasingPrices = {1, 2};

        assertEquals(1, BestTimeToBuyAndSellStockOptimized.maxProfit(increasingPrices));
    }

    @Test
    void testMaxProfitForConstantPrice() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] input = {8, 8, 8, 8};

        assertEquals(0, BestTimeToBuyAndSellStockOptimized.maxProfit(input));
    }

    @Test
    void testMaxProfitForDecreasingPrices() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] decreasingPricesInput1 = {7, 6, 4, 3, 1};
        int[] decreasingPricesInput2 = {10, 3, 1, 0};
        int[] decreasingPricesInput3 = {7, 1};
        int[] decreasingPricesInput4 = {100, 50, 25, 24, 23, 22, 1, 0};

        assertEquals(0, BestTimeToBuyAndSellStockOptimized.maxProfit(decreasingPricesInput1));
        assertEquals(0, BestTimeToBuyAndSellStockOptimized.maxProfit(decreasingPricesInput2));
        assertEquals(0, BestTimeToBuyAndSellStockOptimized.maxProfit(decreasingPricesInput3));
        assertEquals(0, BestTimeToBuyAndSellStockOptimized.maxProfit(decreasingPricesInput4));
    }

    @Test
    void testMaxProfitForOneDayLongTimePeriod() {
        BestTimeToBuyAndSellStockOptimized BestTimeToBuyAndSellStockOptimized =
                new BestTimeToBuyAndSellStockOptimized();

        int[] oneDayPeriodInput = {13};

        assertEquals(0, BestTimeToBuyAndSellStockOptimized.maxProfit(oneDayPeriodInput));
    }
}
