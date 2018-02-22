package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class passwordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }
        else{
            System.out.println("Wrong password!");
        }
    }
}
