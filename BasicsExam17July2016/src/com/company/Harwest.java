package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class Harwest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double harvestArea = Double.parseDouble(scanner.nextLine());
        double grapeProduction = Double.parseDouble(scanner.nextLine());
        double wineNeed = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double allGrape = harvestArea*grapeProduction;

        double grapeNeed = wineNeed*2.5;

        if (allGrape*0.4>=grapeNeed){
            double totalWine = (allGrape-(allGrape*0.6))/2.5;
            double fira = totalWine-wineNeed;

            System.out.printf("Good harvest this year! Total wine: %d liters.\n" , (int)Math.floor(totalWine));
            System.out.printf("%d liters left -> %d liters per person.", (int)Math.ceil(fira) , (int)Math.ceil(fira/workers));
        }else {
            double nedostig = grapeNeed-(allGrape*0.4);
            double needWine = nedostig/2.5;


            System.out.printf("It will be a tough winter! More %d liters wine needed." , (int)Math.floor(needWine));
        }
    }
}
//17 min