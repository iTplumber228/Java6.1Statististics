package ru.netology.javaqa.javaqamvn.services;

import org.jetbrains.annotations.NotNull;

public class StatsService {
    public int calcSum(int @NotNull [] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int findAverageSum(int @NotNull [] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / 12; // для расчёта средней суммы, сумму всех продаж разделили на кол-во месяцев
    }

    public int findMaxSalesMonth(int @NotNull [] sales) {
        int maxSalesMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxSalesMonth]) {
                maxSalesMonth = month;
            }
            month = month + 1;
        }
        return maxSalesMonth + 1;
    }

    public int findMinSalesMonth(int @NotNull [] sales) {
        int minSalesMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minSalesMonth]) {
                minSalesMonth = month;
            }
            month = month + 1;
        }
        return minSalesMonth + 1;
    }

    public int findMonthSalesUnderAverage(int[] sales) {
        int findMonthSalesUnderAverage = 0;
        int findAverageSum = findAverageSum(sales);
        for (int sale : sales) {
            if (sale < findAverageSum) {
                findMonthSalesUnderAverage = findMonthSalesUnderAverage + 1;
            }
        }
        return findMonthSalesUnderAverage;
    }

    public int findMonthSalesOverAverage(int[] sales) {
        int findMonthSalesOverAverage = 0;
        int findAverageSum = findAverageSum(sales);
        for (int sale : sales) {
            if (sale > findAverageSum) {
                findMonthSalesOverAverage = findMonthSalesOverAverage + 1;
            }
        }
        return findMonthSalesOverAverage;
    }
}





