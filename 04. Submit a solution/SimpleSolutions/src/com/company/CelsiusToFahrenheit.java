package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float celsius = Float.parseFloat(scanner.nextLine());

        float fahrenheit = (float) (celsius * 1.8+32);

        System.out.printf("%.2f" , fahrenheit);
    }
}
