package com.company;

import java.util.Scanner;

/**
 * Created by User on 26.4.2017 г..
 */
public class StopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (int i = m; i >= n; i--) {
            if (i%2==0){
                if (i%3==0){
                    if (i!=s){
                        System.out.print(i + " ");
                    }else {
                        break;
                    }
                }
            }
        }
    }
}
