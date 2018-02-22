package com.company;

import java.util.Scanner;

/**
 * Created by User on 5.5.2017 г..
 */
public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometers = Double.parseDouble(scanner.nextLine());
        double sum = 0.0;

        if (season.equals("Spring") || season.equals("Autumn")){
            if (kilometers<=5000){
                sum = kilometers*0.75;
            }else if (kilometers>5000 && kilometers<=10000){
                sum= kilometers*0.95;
            }else if (kilometers>10000 && kilometers<=20000){
                sum = kilometers*1.45;
            }
        }else if (season.equals("Summer")){
            if (kilometers<=5000){
                sum = kilometers*0.90;
            }else if (kilometers>5000 && kilometers<=10000){
                sum= kilometers*1.1;
            }else if (kilometers>10000 && kilometers<=20000){
                sum = kilometers*1.45;
            }
        }else if (season.equals("Winter")){
            if (kilometers<=5000){
                sum = kilometers*1.05;
            }else if (kilometers>5000 && kilometers<=10000){
                sum= kilometers*1.25;
            }else if (kilometers>10000 && kilometers<=20000){
                sum = kilometers*1.45;
            }
        }
        System.out.printf("%.2f", (sum*4)*0.9);

    }
}
