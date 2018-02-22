package com.company;

import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class TrainingLab {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        int hCentimeters= (int)(h*100);
        int widthCentimeters = (int) (width*100-100);

        int deckH = 120;
        int deckWidth = 70;

        int numberOfRows= (int) Math.floor(hCentimeters/deckH);
        int numberOfdeck = (int) Math.floor(widthCentimeters/deckWidth);

        int decks= numberOfdeck*numberOfRows-3;

        System.out.println(decks);
    }
}
