package com.company;

import java.util.Scanner;

/**
 * Created by User on 4.5.2017 г..
 */
public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double price = 0.0;
        String clas = null;
        String car = null;

        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = (budget * 35) /100;
            }if (season.equals("Winter")){
                car = "Jeep";
                price = (budget*65)/100;
            }
        }if (budget>100 && budget<=500){
            clas = "Compact class";
            if (season.equals("Summer")) {
                price = (budget *45)/100;
                car = "Cabrio";
            }if (season.equals("Winter")){
                price = (budget*80)/100;
                car = "Jeep";
            }
        }if (budget>500){
            clas = "Luxury class";
            price = (budget*90)/100;
            car = "Jeep";
        }

        System.out.println(clas);
        System.out.printf("%s - %.2f", car , price);
    }
}
