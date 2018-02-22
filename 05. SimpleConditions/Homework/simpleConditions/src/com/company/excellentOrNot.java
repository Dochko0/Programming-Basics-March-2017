package com.company;

import java.util.Scanner;

/**
 * Created by User on 17.3.2017 г..
 */
public class excellentOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        if (number >= 5.50){
            System.out.println("Excellent!");
        }else {
            System.out.println("Not excellent.");
        }
    }
}
