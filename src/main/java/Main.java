import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long amount = service.amountOfSales(sales);
        long averageAmount = service.averageAmountPerMonth(sales);
        long maxMonth = service.getMaxMonth(sales);
        long minMonth = service.getMinMonth(sales);
        long belowAverage = service.salesAreBelowAverage(sales);
        long aboveAverage = service.salesAreAboveAverage(sales);

        System.out.println("Сумма всех продаж составила - " + amount);
        System.out.println("Средняя суммуа продаж в месяц - " + averageAmount);
        System.out.println("Максимальная сумма продаж была в " + maxMonth + " месяце");
        System.out.println("Минимальная сумма продаж была в " + minMonth + " месяце");
        System.out.println("Количество месяцев, в которых продажи были ниже среднего - " + belowAverage);
        System.out.println("Количество месяцев, в которых продажи были выше среднего - " + aboveAverage);
    }
}
