package ru.netology.javaqamvn7.services;


public class StatsService {

    public int minSales(int[] sales) {
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


    public int maxSales(int[] sales) {
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


    public int getSumSales(int[] sales) {
        int array[] = sales;
        int sum = 0;
        for (int element : sales)
            sum += element;

            return sum;
    }


    public int findSumUsingStream(int[] sales) {
        int sum = 0;
        for (int element : sales)
            sum += element;
        int average = sum / 12;

        return average;
    }


    public int minSalesMonths(int[] sales) {
        int middle = findSumUsingStream(sales);
        int months = 0;
        int month = 1;
        for (long sale : sales) {
            if (sale < middle) {
                months += month;
            }
        }
        return months;
    }


    public int maxSalesMonths(int[] sales) {
        int middle = findSumUsingStream(sales);
        int months = 0;
        int month = 1;
        for (long sale : sales) {
            if (sale >= middle) {
                months += month;
            }
        }
        return months;
    }
}

























