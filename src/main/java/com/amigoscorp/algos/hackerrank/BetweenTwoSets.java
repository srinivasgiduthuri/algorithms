package com.amigoscorp.algos.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int aMaxElement = a[a.length - 1];
        int bMinElement = b[0];
        int numberOfFactors = 0;
        for (int factor = aMaxElement; factor <= bMinElement; factor++) {
            boolean isFactor = true;
            for (int element : a) {
                isFactor = factor % element == 0 && isFactor;
            }
            if (isFactor) {
                boolean isFactorForAll = true;
                for (int element : b) {
                    isFactorForAll = element % factor == 0 && isFactorForAll;
                }
                if (isFactorForAll) {
                    numberOfFactors++;
                }
            }
        }
        return numberOfFactors;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nm = scan.nextLine().split(" ");
        int n = Integer.parseInt(nm[0].trim());
        int m = Integer.parseInt(nm[1].trim());
        int[] a = new int[n];
        String[] aItems = scan.nextLine().split(" ");
        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }
        int[] b = new int[m];
        String[] bItems = scan.nextLine().split(" ");
        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
