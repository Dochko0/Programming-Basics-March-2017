package com.company;

import java.util.Scanner;

public class squareArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Insert a:");

        int a = Integer.parseInt(scanner.nextLine());

        int result = a*a;

        System.out.println(result);

    }
}
