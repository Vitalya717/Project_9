package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTheAmountOfSales() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int actual = service.amountOfSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldFindTheAverageAmountPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int actual = service.averageAmountPerMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindTheMaxMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 6;
        int actual = service.getMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindTheMinMonth() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int actual = service.getMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindBelowAverage() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.salesAreBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void necessaryFindAboveAverage() {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int actual = service.salesAreAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
