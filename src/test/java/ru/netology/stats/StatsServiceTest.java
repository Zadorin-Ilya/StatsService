package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test


    public void shouldSum() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldavg() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long actual = service.avg(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldminavgSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long actual = service.minavgSales(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldmaxavgSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long actual = service.maxavgSales(sales);
        long expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldminSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long actual = service.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldmaxSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        long actual = service.maxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }
}
