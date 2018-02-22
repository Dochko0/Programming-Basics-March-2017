package com.company;

import java.util.Scanner;

/**
 * Created by User on 7.5.2017 г..
 */
public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacityStadion = Double.parseDouble(scanner.nextLine());
        double fans = Double.parseDouble(scanner.nextLine());
        double sectorA = 0.0;
        double sectorB = 0.0;
        double sectorV = 0.0;
        double sectorG = 0.0;





        for (int i = 0; i < fans; i++) {
            String sector = scanner.nextLine();

            switch (sector){
                case "A":
                    sectorA++;
                    break;
                case "B":
                    sectorB++;
                    break;
                case "V":
                    sectorV++;
                    break;
                case "G":
                    sectorG++;
                    break;
                    default:
                        break;
            }
        }

        double percentA = (sectorA/fans)*100;
        double percentB = (sectorB/fans)*100;
        double percentV = (sectorV/fans)*100;
        double percentG = (sectorG/fans)*100;
        double allfans = ((sectorA+sectorB+sectorV+sectorG)/capacityStadion)*100;


        System.out.printf("%.2f%%\n", percentA);
        System.out.printf("%.2f%%\n", percentB);
        System.out.printf("%.2f%%\n", percentV);
        System.out.printf("%.2f%%\n", percentG);
        System.out.printf("%.2f%%\n", allfans);


    }
}
