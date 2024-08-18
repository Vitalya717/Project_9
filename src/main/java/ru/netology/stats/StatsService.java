package ru.netology.stats;

public class StatsService {
    public int amountOfSales(int[] sales) {
        int amount = 0;
        for (int i = 0; i < sales.length; i++) {
            amount = amount + sales[i];
        }
        return amount;
    }

    public int averageAmountPerMonth(int[] sales) {
        int averageAmount = amountOfSales(sales) / sales.length;
        return averageAmount;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesAreBelowAverage(int[] sales) {
        int averageAmount = averageAmountPerMonth(sales);
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int salesAreAboveAverage(int[] sales) {
        int averageAmount = averageAmountPerMonth(sales);
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
