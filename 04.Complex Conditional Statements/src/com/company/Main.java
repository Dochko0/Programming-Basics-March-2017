package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double years = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        if ("m".equals(sex)) {
            if (years < 16) {
                System.out.println("Master");
            } else if (years >= 16) {
                System.out.println("Mr.");
            }
        } else if ("f".equals(sex)) {
            if (years < 16) {
                System.out.println("Miss");
            } else if (years >= 16) {
                System.out.println("Ms.");
            }
        }
    }
}