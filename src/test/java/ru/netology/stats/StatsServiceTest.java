package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTheAmountOfSales() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        long actual = service.amountOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindTheAverageAmountPerMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        long actual = service.averageAmountPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindTheMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 6;
        long actual = service.getMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindTheMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        long actual = service.getMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        long actual = service.salesAreBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        long actual = service.salesAreAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
