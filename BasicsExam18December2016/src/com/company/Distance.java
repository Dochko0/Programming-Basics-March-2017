package com.company;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstSpeed = Double.parseDouble(scanner.nextLine());
        double firstTime = Double.parseDouble(scanner.nextLine());
        double secondTime = Double.parseDouble(scanner.nextLine());
        double thrirdTime = Double.parseDouble(scanner.nextLine());
        double secondSpeed = firstSpeed*1.1;
        double thirdSpeed = secondSpeed*0.95;

        double firstKilometers = firstSpeed*(firstTime/60);
        double secondKilometers = (firstSpeed*1.1)*(secondTime/60);
        double thridrKilometers = (thirdSpeed*(thrirdTime/60));

        System.out.printf("%.2f", firstKilometers+secondKilometers+thridrKilometers);
    }
}
