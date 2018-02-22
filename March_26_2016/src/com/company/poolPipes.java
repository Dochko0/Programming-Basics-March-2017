package com.company;


import java.util.Scanner;

public class poolPipes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double obemBasein = Double.parseDouble(scanner.nextLine());
        double debitPyrvaTryba = Double.parseDouble(scanner.nextLine());
        double debitVtoraTryba = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double pointTwoHours = hours * 10;

        double pyrvaTryba = debitPyrvaTryba * hours;
        double vtoraTryba = debitVtoraTryba * hours;
        double kolichestvoVodaOtDveteTrybi = pyrvaTryba + vtoraTryba;

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
            int fullHours = (int) Math.floor(hours);

            if (hours == fullHours) {
                double prelql = kolichestvoVodaOtDveteTrybi - obemBasein;
                int prelqlCql = (int) Math.floor(prelql);
                double prelqlCql10 = prelql * 10;
                if (prelql == prelqlCql) {
                    System.out.printf("For %d hours the pool overflows with %d liters.", fullHours, prelqlCql);
                }
                if (prelql != prelqlCql) {
                    int prelqlCqlTen = (int) Math.floor(prelqlCql10);
                    if (prelqlCqlTen == prelqlCql10) {
                        System.out.printf("For %d hours the pool overflows with %.1f liters.", fullHours, prelql);
                    }
                    if (prelqlCqlTen != prelqlCql10) {
                        System.out.printf("For %d hours the pool overflows with %.2f liters.", fullHours, prelql);
                    }
                }
            }

            if (hours != fullHours) {
                double pointTwo = Math.floor(pointTwoHours);
                if (pointTwoHours == pointTwo) {
                    double prelql = kolichestvoVodaOtDveteTrybi - obemBasein;
                    int prelqlCql = (int) Math.floor(prelql);
                    double prelqlCql10 = prelql * 10;
                    if (prelql == prelqlCql) {
                        System.out.printf("For %.1f hours the pool overflows with %d liters.", hours, prelqlCql);
                    }
                    if (prelql != prelqlCql) {
                        int prelqlCqlTen = (int) Math.floor(prelqlCql10);
                        if (prelqlCqlTen == prelqlCql10) {
                            System.out.printf("For %.1f hours the pool overflows with %.1f liters.", hours, prelql);
                        }
                        if (prelqlCqlTen != prelqlCql10) {
                            System.out.printf("For %.1f hours the pool overflows with %.2f liters.", hours, prelql);
                        }
                    }
                }
                if (pointTwoHours != pointTwo) {
                    double prelql = kolichestvoVodaOtDveteTrybi - obemBasein;
                    int prelqlCql = (int) Math.floor(prelql);
                    double prelqlCql10 = prelql * 10;
                    if (prelql == prelqlCql) {
                        System.out.printf("For %.2f hours the pool overflows with %d liters.", hours, prelqlCql);
                    }
                    if (prelql != prelqlCql) {
                        int prelqlCqlTen = (int) Math.floor(prelqlCql10);
                        if (prelqlCqlTen == prelqlCql10) {
                            System.out.printf("For %.2f hours the pool overflows with %.1f liters.", hours, prelql);
                        }
                        if (prelqlCqlTen != prelqlCql10) {
                            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, prelql);
                        }
                    }
                }
            }
        }
    }
}

