package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
 @Test


    public void shouldSum () {

     long [] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

     StatsService service = new StatsService();

     long actual = service.sum(sales);
     long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
     Assertions.assertEquals(expected, actual);

 }

}
