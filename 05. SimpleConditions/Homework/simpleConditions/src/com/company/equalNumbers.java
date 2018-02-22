package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class equalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber == secondNumber && firstNumber==thirdNumber){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
