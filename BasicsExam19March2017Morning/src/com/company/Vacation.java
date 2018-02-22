package com.company;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String settlement = "";
        String place = "";
        double cost = 0.0;

        if (budget<=1000){
            settlement="Camp";
            if (season.equals("Summer")){
                place="Alaska";
                cost = (budget*65)/100;
            }else if (season.equals("Winter")) {
                place = "Morocco";
                cost = (budget * 45) / 100;
            }
        }else if (budget>1000 && budget<=3000){
            settlement="Hut";
            if (season.equals("Summer")){
                place="Alaska";
                cost = (budget*80)/100;
            }else if (season.equals("Winter")) {
                place = "Morocco";
                cost = (budget * 60) / 100;
            }
        }else if (budget>3000){
            settlement="Hotel";
            if (season.equals("Summer")){
                place="Alaska";
                cost = (budget*90)/100;
            }else if (season.equals("Winter")) {
                place = "Morocco";
                cost = (budget * 90) / 100;
            }
        }
        System.out.printf("%s - %s - %.2f", place , settlement , cost);
    }
}
