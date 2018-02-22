package com.company;

import java.util.Scanner;

/**
 * Created by User on 1.5.2017 г..
 */
public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        double widthFloor = Double.parseDouble(scanner.nextLine());
        double lenghtFloor = Double.parseDouble(scanner.nextLine());
        double sideTriangle = Double.parseDouble(scanner.nextLine());
        double highTriangle = Double.parseDouble(scanner.nextLine());
        double priceTiles = Double.parseDouble(scanner.nextLine());
        double maistor = Double.parseDouble(scanner.nextLine());

        double area = widthFloor*lenghtFloor;
        double tiles = (sideTriangle*highTriangle)/2;
        double need = Math.ceil(area/tiles)+5;
        double sum = need*priceTiles;
        double needMoney = sum + maistor;

        if (money>=needMoney){
            System.out.printf("%.2f lv left.", money-needMoney);
        }else {
            System.out.printf("You'll need %.2f lv more." , needMoney-money);
        }






    }
}
