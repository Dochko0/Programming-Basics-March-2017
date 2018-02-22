package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class GreetingbyName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.printf("Hello, %s!" , name);

    }
}
