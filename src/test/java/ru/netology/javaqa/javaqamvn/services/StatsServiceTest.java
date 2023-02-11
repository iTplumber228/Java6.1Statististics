package ru.netology.javaqa.javaqamvn.services;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    void calcSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calcSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findAverageSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverageSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.findMaxSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMinSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMinSalesMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthSalesUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMonthSalesUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthSalesOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMonthSalesOverAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}

