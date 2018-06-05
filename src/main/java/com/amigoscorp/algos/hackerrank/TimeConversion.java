package com.amigoscorp.algos.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) {
        String meridiem = s.substring(8);
        int hours = Integer.parseInt(s.substring(0, 2));
        if (meridiem.equalsIgnoreCase("PM")) {
            if (hours <= 11) {
                hours += 12;
            }
        } else if (meridiem.equalsIgnoreCase("AM")) {
            if (hours == 12) {
                hours = 0;
            }
        }
        String hoursString = hours < 10? "0" + hours : hours + "";
        return hoursString + s.substring(2, 8);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = scan.nextLine();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
