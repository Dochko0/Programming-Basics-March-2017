package com.company;

import java.util.Scanner;

public class Fishland {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudKilos = Double.parseDouble(scanner.nextLine());
        double safridKilos = Double.parseDouble(scanner.nextLine());
        double midiKilos = Double.parseDouble(scanner.nextLine());

        double palamudPrice = skumriqPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double midiPrice = 7.50;

        double sumPalamud = palamudKilos * palamudPrice;
        double sumSafrid = safridKilos * safridPrice;
        double sumMidi = midiKilos * midiPrice;

        System.out.printf("%.2f", sumMidi + sumPalamud + sumSafrid);
    }
}
