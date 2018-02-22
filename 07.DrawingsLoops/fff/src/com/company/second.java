package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.4.2017 г..
 */
public class second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String text = new String(new char [num]).replaceAll("\0", "*");

        System.out.println(text);
    }
}
