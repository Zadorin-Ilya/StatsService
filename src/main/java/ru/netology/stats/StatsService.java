package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long avg(long[] sales) {
        return sum(sales) / 12;

    }

    public int minavgSales(long[] sales) {
        int minavgMonth = 0;
        long avg = avg(sales);
        for (long sale : sales) {
            if (sale < avg) {
                minavgMonth++;
            }
        }
        return minavgMonth;
    }


    public int maxavgSales(long[] sales) {
        int maxavgMonth = 0;
        long avg = avg(sales);
        for (long sale : sales) {
            if (sale >= avg) {
                maxavgMonth++;
            }

        }
        return maxavgMonth;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;

    }
}

