package com.company;

import java.util.Scanner;

/**
 * Created by User on 22.3.2017 г..
 */
public class fruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String object = scanner.nextLine();
        String fruits = "banana apple kiwi cherry,lemon grapes";
        String vegetables = "tomato cucumber pepper carrot";

        if (fruits.contains(object)){
            System.out.println("fruit");
        }else if (vegetables.contains(object)){
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }
    }
}
