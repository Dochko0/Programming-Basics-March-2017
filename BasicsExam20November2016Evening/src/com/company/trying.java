package com.company;

import java.util.Scanner;

public class trying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int HourOfExam = Integer.parseInt(scanner.nextLine()) ;
        int MinuteOfExam = Integer.parseInt(scanner.nextLine());
        int HourOfArrival = Integer.parseInt(scanner.nextLine());
        int MinuteOfArrival = Integer.parseInt(scanner.nextLine());

        int diff = ((HourOfExam * 60) + MinuteOfExam) - ((HourOfArrival * 60) + MinuteOfArrival);
        int hour = Math.abs(diff / 60);
        int minute = Math.abs(diff % 60);

        if (diff == 0)
        {
            System.out.println("On Time");
        }
        else if (diff >= 1 && diff <= 30)
        {
            System.out.println("On Time");
            System.out.printf("%d minutes before the start", diff);
        }
        else if (diff > 30 && diff <= 59)
        {
            System.out.println("Early");
            System.out.printf("%d minutes before the start", diff);
        }
        else if (diff == 60)
        {
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", hour, minute);
        }
        else if (diff > 60 && diff <= 69)
        {
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", hour, minute);
        }
        else if (diff >= 70)
        {
            System.out.println("Early");
            System.out.printf("%d:%02d hours before the start", hour, minute);
        }
        else if (diff < 0 && diff >= -59)
        {
            System.out.println("Late");
            System.out.printf("%d minutes after the start,",Math.abs(diff));
        }
        else if (diff == 60)
        {
            System.out.println("Late");
            System.out.printf("%d:%02d hours after the start", hour, minute);
        }
        else if (diff < 60 && diff >= 69)
        {
            System.out.println("Late");
            System.out.printf("{%d:%02d hours after the start", hour, minute);
        }
        else if (diff <= 70)
        {
            System.out.println("Late");
            System.out.printf("%d:%02d hours after the start", hour, minute);
        }
    }
}