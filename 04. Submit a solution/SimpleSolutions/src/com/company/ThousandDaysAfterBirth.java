package com.company;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by User on 13.3.2017 г..
 */
public class ThousandDaysAfterBirth {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String text = scanner.nextLine();
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        LocalDate after1K = parsedDate.plusDays(999);
        System.out.printf("%1$td-%1$tm-%1$tY", after1K);

    }
}
