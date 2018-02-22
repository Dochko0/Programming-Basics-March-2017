package com.company;

import java.util.Scanner;

/**
 * Created by User on 7.5.2017 г..
 */
public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        double pupils = Double.parseDouble(scanner.nextLine());
        double nights = Double.parseDouble(scanner.nextLine());
        String sport = "";
        double price = 0.0;

        if (season.equals("Winter")) {
            if (group.equals("boys")) {
                price = nights * 9.6 * pupils;
                sport = "Judo";
            }else if (group.equals("girls")){
                price = nights * 9.6 * pupils;
                sport = "Gymnastics";
            }else if (group.equals("mixed")) {
                price = nights * 10 * pupils;
                sport = "Ski";
            }
        }else  if (season.equals("Spring")) {
            if (group.equals("boys")) {
                price = nights * 7.2 * pupils;
                sport = "Tennis";
            }else if (group.equals("girls")){
                price = nights * 7.2 * pupils;
                sport = "Athletics";
            }else if (group.equals("mixed")) {
                price = nights * 9.5 * pupils;
                sport = "Cycling";
            }
        }else  if (season.equals("Summer")) {
            if (group.equals("boys")) {
                price = nights * 15 * pupils;
                sport = "Football";
            }else if (group.equals("girls")){
                price = nights * 15 * pupils;
                sport = "Volleyball";
            }else if (group.equals("mixed")) {
                price = nights * 20 * pupils;
                sport = "Swimming";
            }
        }

        if (pupils>=50){
            price = (price*50)/100;
        }if (pupils>=20 && pupils<50){
            price = (price*85)/100;
        }if (pupils>=10 && pupils<20){
            price = (price*95)/100;
        }



        System.out.printf("%s %.2f lv.", sport , price);
    }
}
