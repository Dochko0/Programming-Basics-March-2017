package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class InchestoCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert inches:");

        double inch = Double.parseDouble(scanner.nextLine());

        double centimeters = inch*2.54;

        System.out.println(centimeters);
    }
}
