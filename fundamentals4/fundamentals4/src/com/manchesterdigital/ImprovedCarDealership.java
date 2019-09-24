package com.manchesterdigital;

public class ImprovedCarDealership {
    public static void main(String[] args) {
        boolean taxYearEnded = true;
        int baseSalary = 20000;
        int numberOfSales = 1000;
        double comissionRate = 3.0;
        int bonus = 1000;

        calcSalaray(taxYearEnded, numberOfSales, baseSalary, comissionRate);

        numberOfSales = 300;
        baseSalary = 25000;
        comissionRate = 2.0;

        calcSalaray(taxYearEnded, numberOfSales, baseSalary, comissionRate);
    }

    private static void calcSalaray(boolean taxYearEnded,
                                    int numberOfSales,
                                    double baseSalary,
                                    double comissionRate) {
        if (taxYearEnded) {
            int bonus = 10000;
            double totalSalary = baseSalary;

            if (numberOfSales > 500) {
                totalSalary = baseSalary + (numberOfSales * comissionRate);
                totalSalary += bonus;
            }

            System.out.println("Total salary is: " + totalSalary);
        }
    }
}
