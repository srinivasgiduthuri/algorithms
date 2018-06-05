package com.amigoscorp.algos.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class ArrayChunks {
    private static void arrayChunks(int n, int[] ar) {
        int length = ar.length;
        if (length <= n) {
            printArray(ar);
        } else {
            int numberOfChunks = (length % n) == 0 ? (length / n) : (length / n) + 1;
            System.out.println(numberOfChunks);
            int[][] chunks = new int[numberOfChunks][n];
            for (int i = 0; i < numberOfChunks; i++) {
                int[] chunk = new int[n];
                for (int j = 0; j < n; j++) {
                    int index = j + (i * n);
                    if (index < length) {
                        chunk[j] = ar[index];
                    }
                }
                printArray(chunk);
                chunks[i] = chunk;
            }
        }
    }

    private static void printArray(int[] ar) {
        for (int element : ar) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scan.nextLine().trim());
        String[] arItems = scan.nextLine().split(" ");
        int[] ar = new int[arItems.length];
        for (int arItr = 0; arItr < arItems.length; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }
        arrayChunks(n, ar);
    }
}
