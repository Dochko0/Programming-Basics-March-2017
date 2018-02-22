package com.company;

import java.util.Scanner;

/**
 * Created by User on 28.4.2017 г..
 */
public class logistik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loads = Integer.parseInt(scanner.nextLine());
        double busPrice = 0.0;
        double tirPrice = 0.0;
        double trainPrice = 0.0;
        double allLoad = 0.0;


        for (int i = 0; i < loads; i++) {
            double eachLoad = Double.parseDouble(scanner.nextLine());

            if (eachLoad<=3){
                busPrice+= (eachLoad*200);
            }else if (eachLoad>=4 && eachLoad<=11){
                tirPrice+=(eachLoad*175);
            }else if (eachLoad>=12){
                trainPrice+=(eachLoad*120);
            }
            allLoad+=eachLoad;
        }
        double middlePrice = (busPrice+trainPrice+tirPrice)/allLoad;
        double busPer = ((busPrice/200)/allLoad)*100;
        double tirPer = ((tirPrice/175)/allLoad)*100;
        double trainPer = ((trainPrice/120)/allLoad)*100;

        System.out.printf("%.2f\n", middlePrice);
        System.out.printf("%.2f%%\n",busPer);
        System.out.printf("%.2f%%\n",tirPer);
        System.out.printf("%.2f%%\n",trainPer);

    }
}
