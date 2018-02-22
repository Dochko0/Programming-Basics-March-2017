package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by User on 29.3.2017 г..
 */
public class oddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;

        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Integer.MIN_VALUE ;

        NumberFormat format =new DecimalFormat("#.##########");

        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 != 0) { //even
                evenSum = evenSum + num;
                if (evenMax < num) {
                    evenMax = num;
                }if (evenMin > num) {
                    evenMin = num;
                }
            } else {
                oddSum = oddSum + num;
                if (oddMax < num) {
                    oddMax = num;
                }if (oddMin > num) {
                    oddMin = num;
                }
            }
        }
        System.out.println("OddSum=" + format.format(oddSum) + ",");
        if (oddMin == Double.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.println("OddMin=" + format.format(oddMin) + ",");
        }
        if (oddMax == Integer.MIN_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.println("OddMax=" + format.format(oddMax) + ",");
        }
        System.out.println("EvenSum=" + format.format(evenSum) + ",");
        if (evenMin == Double.MAX_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.println("EvenMin=" + format.format(evenMin) + ",");
        }
        if (evenMax == Integer.MIN_VALUE) {
            System.out.println("EvenMax=No,");
        } else {
            System.out.println("EvenMax=" + format.format(evenMax));
        }
    }
}
