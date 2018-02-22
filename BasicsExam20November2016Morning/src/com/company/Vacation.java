package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double oldPerson = Double.parseDouble(scanner.nextLine());
        double pupil = Double.parseDouble(scanner.nextLine());
        double nights = Double.parseDouble(scanner.nextLine());
        String transport = scanner.nextLine();

        double transportOldPerson = 0.0;
        double transportpupil = 0.0;
        double priceNights = 0.0;
        double finPrice = 0.0;

        if (transport.equals("train")){
            transportOldPerson = oldPerson*24.99;
            transportpupil = pupil*14.99;

            if (oldPerson+pupil >= 50) {
                transportOldPerson=transportOldPerson*0.5;
                transportpupil=transportpupil*0.5;
            }
        } else if (transport.equals("bus")) {
            transportOldPerson = oldPerson * 32.5;
            transportpupil = pupil * 28.50;

        }else if (transport.equals("boat")) {
            transportOldPerson = oldPerson * 42.99;
            transportpupil = pupil * 39.99;

        }else if (transport.equals("airplane")) {
            transportOldPerson = oldPerson * 70;
            transportpupil = pupil * 50;
        }

        priceNights = nights * 82.99;
        finPrice = (priceNights + (transportOldPerson + transportpupil)*2) * 1.1;

        System.out.printf("%.2f", finPrice);
    }
}
