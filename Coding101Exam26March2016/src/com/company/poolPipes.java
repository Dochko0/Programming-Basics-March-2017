package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by User on 25.4.2017 г..
 */
public class poolPipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double firstPipe = p1 * h;
        double secondPipe = p2 * h;
        double bouth = firstPipe + secondPipe;
        DecimalFormat df = new DecimalFormat("#.#########");

        if (bouth <= v) {
            double allPercent = Math.floor((bouth / v) * 100);
            double firstPercent = Math.floor((firstPipe / bouth) * 100);
            double secondPercent = Math.floor((secondPipe / bouth) * 100);
            System.out.printf("The pool is %s%% full. Pipe 1: %s%%. Pipe 2: %s%%.", df.format(allPercent),
                    df.format(firstPercent), df.format(secondPercent));

        } else {
            double overPool = bouth - v;

            System.out.printf("For %s hours the pool overflows with %s liters.", df.format(h), df.format(overPool));
        }
    }
}
