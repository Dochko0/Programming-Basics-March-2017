package com.company;

import java.util.Scanner;

/**
 * Created by User on 28.4.2017 г..
 */
public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double juniors = Double.parseDouble(scanner.nextLine());
        double seniors = Double.parseDouble(scanner.nextLine());
        String trace = scanner.nextLine();
        double fromjuniors = 0;
        double fromSeniors = 0;
        double income = 0;

        if (trace.equals("trail")){
            fromjuniors=juniors*5.5;
            fromSeniors=seniors*7;
            income = (fromjuniors+fromSeniors)* 0.95;

            System.out.printf("%.2f", income);
        } else if (trace.equals("cross-country")){
            fromjuniors=juniors*8;
            fromSeniors=seniors*9.5;
            if ((juniors+seniors)>=50){
                income = ((fromjuniors+fromSeniors)*0.75)* 0.95;
            }else {
                income = (fromjuniors+fromSeniors)* 0.95;
            }

            System.out.printf("%.2f", income);
        }else if (trace.equals("downhill")){
            fromjuniors=juniors*12.25;
            fromSeniors=seniors*13.75;
            income = (fromjuniors+fromSeniors)* 0.95;

            System.out.printf("%.2f", income);
        }else if (trace.equals("road")){
            fromjuniors=juniors*20;
            fromSeniors=seniors*21.5;
            income = (fromjuniors+fromSeniors)* 0.95;

            System.out.printf("%.2f", income);
        }
    }
}
