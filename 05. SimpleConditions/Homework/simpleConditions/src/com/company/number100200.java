package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class number100200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number < 100){
            System.out.println("Less than 100");
        }
        else if (number>=100 && number<=200){
            System.out.println("Between 100 and 200");
        }
        else if (number>200){
            System.out.println("Greater than 200");
        }
    }
}
