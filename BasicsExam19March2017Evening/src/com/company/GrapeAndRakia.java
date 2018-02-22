package com.company;

import java.util.Scanner;

public class GrapeAndRakia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vineYard = Double.parseDouble(scanner.nextLine());
        double production = Double.parseDouble(scanner.nextLine());
        double brak = Double.parseDouble(scanner.nextLine());

        double sumProduct = vineYard*production-brak;

        double fRakia = sumProduct*0.45;
        double fProdajba = sumProduct*0.55;
        double rakia = fRakia/7.5;
        double sumRakia = rakia*9.8;
        double grape = fProdajba*1.5;

        System.out.printf("%.2f\n", sumRakia);
        System.out.printf("%.2f", grape);
    }
}
