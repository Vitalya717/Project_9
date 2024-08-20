package ru.netology.stats;

public class StatsService {
    public long amountOfSales(long[] sales) {
        long amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public long averageAmountPerMonth(long[] sales) {
        long averageAmount = amountOfSales(sales) / sales.length;
        return averageAmount;
    }

    public int getMaxMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesAreBelowAverage(long[] sales) {
        long averageAmount = averageAmountPerMonth(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int salesAreAboveAverage(long[] sales) {
        long averageAmount = averageAmountPerMonth(sales);
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
