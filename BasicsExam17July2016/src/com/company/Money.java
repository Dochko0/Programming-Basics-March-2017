package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoin = Double.parseDouble(scanner.nextLine());
        double china = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double leva = bitcoin*1168.0;
        double evroLeva = leva/1.95;
        double dollar = china*0.15;
        double levaDollar = dollar*1.76;
        double evroLevaSolar = levaDollar/1.95;
        double euro = evroLeva + evroLevaSolar;
        double finEuro = euro - (euro*(commision/100));
        DecimalFormat df = new DecimalFormat("#.##########");
        System.out.printf("%s", df.format(finEuro));

// 8 mins
    }
}
