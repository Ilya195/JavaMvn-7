package ru.netology.javaqamvn7.services;


public class StatsService {

    public int minSales(int[] sales) {
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


    public int GetSumSales(int[] sales) {
        int array[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int element : array)
            sum += element;

        return sum;
    }


    public int findSumUsingStream(int[] sales) {
        int sum = 0;
        for (int value : sales)
            sum += value;
            int average = sum / 12;

            return average;
    }


    public int minSalesMonths(int[] sales) {
        int arraySaleMonth = 15;
        int months = 0;
        int month = 1;
        for (long sale : sales) {
            if (sale < arraySaleMonth) {
                months += month;
            }
        }
        return months;
    }



    public int maxSalesMonths(int[] sales) {
        int arraySaleMonth = 15;
        int months = 0;
        int month = 1;
        for (long sale : sales) {
            if (sale >= arraySaleMonth) {
                months += month;
            }
        }
        return months;
    }

}

























