package com.company;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 * Created by User on 17.3.2017 г..
 */
public class PoolPipes2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double obemBasein = Double.parseDouble(scanner.nextLine());
        double debitPyrvaTryba = Double.parseDouble(scanner.nextLine());
        double debitVtoraTryba = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pyrvaTryba = debitPyrvaTryba * hours;
        double vtoraTryba = debitVtoraTryba * hours;
        double kolichestvoVodaOtDveteTrybi = pyrvaTryba + vtoraTryba;

        DecimalFormat format = new DecimalFormat("#.###############");

        if (obemBasein >= kolichestvoVodaOtDveteTrybi) {
            double napylnenObem = (kolichestvoVodaOtDveteTrybi / obemBasein) * 100;
            double prinosPyrvaTryba = (pyrvaTryba / kolichestvoVodaOtDveteTrybi) * 100;
            double prinosVtoraTryba = (vtoraTryba / kolichestvoVodaOtDveteTrybi) * 100;

            int napylnenObemInt = (int) napylnenObem;
            int prinosPyrvaTrybaInt = (int) prinosPyrvaTryba;
            int prinosVtoraTrybaInt = (int) prinosVtoraTryba;
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", napylnenObemInt, prinosPyrvaTrybaInt, prinosVtoraTrybaInt);


        }
        if (obemBasein < kolichestvoVodaOtDveteTrybi) {

            double prelql = kolichestvoVodaOtDveteTrybi - obemBasein;
            System.out.printf("For %s hours the pool overflows with %s liters.", format.format(hours), format.format(prelql));
        }
    }
}
