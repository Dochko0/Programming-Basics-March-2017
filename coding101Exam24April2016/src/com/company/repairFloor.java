package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class repairFloor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double l = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine());
        double o = Double.parseDouble(scanner.nextLine());

        double areaPlate = n * n;
        double areaSingleElement = w * l;
        double areaBench = m * o;

        double areaForRepair = areaPlate - areaBench;
        double numElements = areaForRepair / areaSingleElement;
        double timeNeed = numElements * 0.2;
        DecimalFormat df = new DecimalFormat("#.###########");
        DecimalFormat dm = new DecimalFormat("#.############");

        System.out.printf("%s\n", df.format(numElements));
        System.out.printf("%s\n", dm.format(timeNeed));

//        System.out.printf("%f\n", numElements);
//        System.out.printf("%f\n", timeNeed);
    }
}
