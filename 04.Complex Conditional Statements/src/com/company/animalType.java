package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.3.2017 г..
 */
public class animalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name=scanner.nextLine();
        String someAnimals = "crocodile tortoise snake";

        if (name.equals("dog")){
            System.out.println("mammal");

        }else if (someAnimals.contains(name)){
            System.out.println("reptile");
        }else {
            System.out.println("unknown");
        }
    }
}
