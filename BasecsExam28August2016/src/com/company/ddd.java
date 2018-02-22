package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class ddd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDays = Integer.parseInt(scanner.nextLine());
        double salaryPerDay = Double.parseDouble(scanner.nextLine());
        double courseLev = Double.parseDouble(scanner.nextLine());

        double monthSalary = workDays * salaryPerDay;
        double yearSalary = monthSalary * 12;
        double salary = yearSalary + monthSalary * 2.5;
        double tax = salary * 0.25;
        double clearSalary = salary - tax;
        double clearSalaryLeva = clearSalary * courseLev;
        double averageProfit = clearSalaryLeva / 365;

        System.out.printf("%.2f", averageProfit);
    }
}
