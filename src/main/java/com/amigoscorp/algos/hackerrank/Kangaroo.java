package com.amigoscorp.algos.hackerrank;

import java.util.Scanner;

// 1817 9931 8417 190
// 4523 8092 9419 8076
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x2 > x1 && v2 > v1) {
            return "NO";
        }
        while (x2 > x1) {
            x1 = x1 + v1;
            x2 = x2 + v2;
            if (x1 == x2) {
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] x1V1X2V2 = scanner.nextLine().split(" ");
        int x1 = Integer.parseInt(x1V1X2V2[0]);
        int v1 = Integer.parseInt(x1V1X2V2[1]);
        int x2 = Integer.parseInt(x1V1X2V2[2]);
        int v2 = Integer.parseInt(x1V1X2V2[3]);
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
