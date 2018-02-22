package com.company;

import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class speedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double speed = Double.parseDouble(scanner.nextLine());

        if (speed<=10.0){
            System.out.println("slow");
        }
        else if (speed>10.0 && speed<=50.0 ){
            System.out.println("average");
        }
        else if (speed>50.0 && speed<=150.0 ){
            System.out.println("fast");
        }
        else if (speed>150.0 && speed<=1000.0 ){
            System.out.println("ultra fast");
        }
        else if (speed>1000.0 ){
            System.out.println("extremely fast");
        }
    }
}
