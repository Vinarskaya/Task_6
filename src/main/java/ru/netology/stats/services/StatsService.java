package ru.netology.stats.services;

public class StatsService {

    public long sumSales(long[] sales) {
        long sumSales = sales[0];
        for (long sale : sales) {
            sumSales = sumSales + sale;
        }
        return sumSales - sales[0];
    }

    public long avgSales(long[] sales) {
        long sumSales = sales[0];
        int month = 0;
        for (long sale : sales) {
            sumSales = sumSales + sale;
            month = month + 1;
        }
        return (sumSales - sales[0])/month;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThanAvgSalesMonths(long[] sales) {
        int badMonths = 0;
        int month = 0;
        long avgSales = avgSales(sales);
        for (long sale : sales) {
            if (sale < avgSales) {
                badMonths = badMonths + 1;
            }
            month = month + 1;
        }
        return badMonths;
    }

    public int moreThanAvgSalesMonths(long[] sales) {
        int goodMonths = 0;
        int month = 0;
        long avgSales = avgSales(sales);
        for (long sale : sales) {
            if (sale > avgSales) {
                goodMonths = goodMonths + 1;
            }
            month = month + 1;
        }
        return goodMonths;
    }

}
