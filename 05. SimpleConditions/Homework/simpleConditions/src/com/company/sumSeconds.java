package com.company;

import java.util.Scanner;

/**
 * Created by User on 19.3.2017 г..
 */
public class sumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstAthlete = Integer.parseInt(scanner.nextLine());
        int secondAthlete = Integer.parseInt(scanner.nextLine());
        int thirdAthlete = Integer.parseInt(scanner.nextLine());

        int sumAthlete = firstAthlete+secondAthlete+thirdAthlete;

        int minutes = (int) Math.floor(sumAthlete/60);
        int seconds = sumAthlete%60;

        if (seconds<10) {

            System.out.printf("%d:0%d", minutes, seconds);
        }
        else    {
            System.out.printf("%d:%d", minutes,seconds);
        }
    }
}
