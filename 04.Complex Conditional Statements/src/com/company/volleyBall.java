package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.3.2017 г..
 */
public class volleyBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeYear = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double weekendsInSofia = 48.0-h;

        double gamesSofia = (weekendsInSofia*3.0)/4.0;
        double holidayGamesInSofia = (p*2.0)/3.0;
        double allGames = gamesSofia+holidayGamesInSofia+h;

        if (typeYear.equals("leap")){
            double leapAllGames = Math.floor(0.15*allGames+allGames);
            System.out.printf("%.0f" , leapAllGames);
        }else {
            double normalAllGames = Math.floor(allGames);
            System.out.printf("%.0f" , normalAllGames);
        }
    }
}
