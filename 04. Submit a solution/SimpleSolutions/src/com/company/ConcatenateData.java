package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class ConcatenateData {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        //System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        //System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        //System.out.println("Enter your town: ");
        String town = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s." , firstName , lastName , age , town);
    }
}
