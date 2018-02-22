package com.company;

import java.util.Scanner;

/**
 * Created by User on 17.3.2017 г..
 */
public class evenOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        if (number%2==0){
            System.out.println("even");
        }else
            System.out.println("odd");

    }
}
