package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.4.2017 г..
 */
public class hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());
        int okPaients = 0;
        int notOkPacients = 0;
        int plusDoctors = 7;

        for (int i = 1; i <= period; i++) {
            if (i % 3 == 0 && notOkPacients > okPaients) {
                plusDoctors++;
            }
            int pacients = Integer.parseInt(scanner.nextLine());

            if (pacients >= plusDoctors) {
                okPaients = okPaients + plusDoctors;
                notOkPacients = notOkPacients + (pacients - plusDoctors);
            }else{
                okPaients = okPaients+pacients;
            }
        }

        System.out.printf("Treated patients: %d.\n" , okPaients);
        System.out.printf("Untreated patients: %d.", notOkPacients);
    }
}
