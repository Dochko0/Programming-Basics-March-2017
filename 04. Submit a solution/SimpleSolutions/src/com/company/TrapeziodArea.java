package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class TrapeziodArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double b1 = Double.parseDouble(scanner.nextLine());
        double b2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        System.out.println(((b1+b2)/2)*h);


    }
}
