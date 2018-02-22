package com.company;

        import java.util.Scanner;

/**
 * Created by User on 20.3.2017 г..
 */
public class equalWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        String firstToCompare = firstWord.toLowerCase();
        String secondToCompare = secondWord.toLowerCase();

        if (firstToCompare.equals(secondToCompare)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
