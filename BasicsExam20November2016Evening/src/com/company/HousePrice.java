package com.company;

import java.util.Scanner;

public class HousePrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double littleRoom = Double.parseDouble(scanner.nextLine());
        double kitchen = Double.parseDouble(scanner.nextLine());
        double pricePerSquare = Double.parseDouble(scanner.nextLine());

        double bath = littleRoom/2;
        double secondRoom = littleRoom*1.1;
        double thirdRoom = secondRoom*1.1;

        double area = (littleRoom+bath+kitchen+secondRoom+thirdRoom)*1.05;
        double price = area*pricePerSquare;

        System.out.printf("%.2f",price);








    }
}
