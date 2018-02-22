package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.3.2017 г..
 */
public class cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int coloums = Integer.parseInt(scanner.nextLine());
        double places = rows*coloums;


        if (projection.equals("Premiere")){

            System.out.printf("%.2f", (places*12));
        }else if (projection.equals("Normal")){
            System.out.printf("%.2f", (places*7.5));
        }else if (projection.equals("Discount")){
            System.out.printf("%2f", (places*5));
        }
    }
}
