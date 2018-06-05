package com.amigoscorp.algos.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int maxHeightCandle = ar[0];
        int maxHeightCandlesCount = 0;
        for (int i : ar) {
            if (i > maxHeightCandle) {
                maxHeightCandle = i;
            }
        }
        for (int i : ar) {
            if (maxHeightCandle == i) {
                maxHeightCandlesCount ++;
            }
        }
        return maxHeightCandlesCount;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] ar = new int[n];

        String[] arItems = scan.nextLine().split(" ");

        for (int arItr = 0; arItr < n; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = birthdayCakeCandles(n, ar);

        System.out.println(result);
    }
}
