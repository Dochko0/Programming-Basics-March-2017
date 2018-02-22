package com.company;

import java.util.Scanner;

public class HousePainting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double frontBackSide = 2*x*x - 2*1.2;
        double leftRightSide = (x*y - 1.5*1.5)*2;
        double roofSides = x*y*2;
        double roofFrontBack = x*h;

        double allSides = frontBackSide+leftRightSide;
        double allRoof = roofFrontBack+roofSides;

        double greenPaintSides = allSides/3.4;
        double redPaintRoof = allRoof/4.3;

        System.out.printf("%.2f\n", greenPaintSides);
        System.out.printf("%.2f", redPaintRoof);
    }
}
