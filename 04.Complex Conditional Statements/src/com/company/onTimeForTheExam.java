package com.company;

import java.util.Scanner;

/**
 * Created by User on 27.3.2017 г..
 */
public class onTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currHour = Integer.parseInt(scanner.nextLine());
        int currMinutes = Integer.parseInt(scanner.nextLine());
        int comeHous = Integer.parseInt(scanner.nextLine());
        int comeMinutes = Integer.parseInt(scanner.nextLine());
        int hours = 0;
        int min = 0;

        if (currHour == comeHous && currMinutes == comeMinutes) {
            System.out.println("On time");
        } else {
            if (currHour == comeHous) {
                if (currMinutes > comeMinutes) {
                    min = currMinutes - comeMinutes;
                    if (min > 30) {
                        System.out.println("Early");
                        System.out.printf("%d minutes before the start", min);
                    } else if (min <= 30) {
                        System.out.println("On time");
                        System.out.printf("%d minutes before the start", min);
                    }
                } else if (comeMinutes > currMinutes) {
                    min = comeMinutes - currMinutes;
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start", min);
                }
            } else if (currHour > comeHous) {
                hours = currHour - comeHous;

                if (currMinutes >= comeMinutes) {
                    min = currMinutes - comeMinutes;
                    if (min >= 10) {
                        System.out.println("Early");
                        System.out.printf("%d:%d hours before the start", hours, min);
                    } else if (min < 10) {
                        System.out.println("Early");
                        System.out.printf("%d:0%d hours before the start", hours, min);
                    }
                } else if (comeMinutes > currMinutes) {
                    if (hours > 1) {
                        hours -= 1;
                        min = 60 - (comeMinutes - currMinutes);
                        if (min >= 10) {
                            System.out.println("Early");
                            System.out.printf("%d:%d hours before the start", hours, min);
                        } else if (min < 10) {
                            System.out.println("Early");
                            System.out.printf("%d:0%d hours before the start", hours, min);
                        }
                    } else if (hours == 1) {
                        min = 60 - (comeMinutes - currMinutes);
                        if (min <= 30) {
                            System.out.println("On time");
                            System.out.printf("%d minutes before the start", min);
                        } else if (min > 30) {
                            System.out.println("Early");
                            System.out.printf("%d minutes before the start", min);
                        }
                    }
                }
            } else if (currHour < comeHous) {
                hours = comeHous - currHour;

                if (currMinutes <= comeMinutes) {
                    min = comeMinutes - currMinutes;
                    if (min < 10) {
                        System.out.println("Late");
                        System.out.printf("%d:0%d hours after the start", hours, min);
                    } else if (min >= 10) {
                        System.out.println("Late");
                        System.out.printf("%d:%d hours after the start", hours, min);
                    }
                } else if (comeMinutes < currMinutes) {
                    if (hours > 1) {
                        hours -= 1;
                        min = 60 - (currMinutes - comeMinutes);
                        if (min < 10) {
                            System.out.println("Late");
                            System.out.printf("%d:0%d minutes after the start", hours, min);
                        } else if (min >= 10) {
                            System.out.println("Late");
                            System.out.printf("%d:%d minutes after the start", hours, min);
                        }
                    } else if (hours == 1) {
                        min = 60 - (currMinutes - comeMinutes);
                        System.out.println("Late");
                        System.out.printf("%d minutes after the start", min);
                    }
                }
            }
        }
    }
}

