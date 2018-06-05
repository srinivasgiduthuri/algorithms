package com.amigoscorp.algos.hackerrank;

import java.util.Scanner;

public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        long max = arr[0];
        long min = arr[0];
        long sum = 0;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) {
                min = i;
            }
            sum += i;
        }
        long maxSum = sum - min;
        long minSum = sum - max;
        System.out.println(minSum + " " + maxSum);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scan.nextLine().split(" ");

        for (int arrItr = 0; arrItr < 5; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr].trim());
            arr[arrItr] = arrItem;
        }

        miniMaxSum(arr);
    }
}
