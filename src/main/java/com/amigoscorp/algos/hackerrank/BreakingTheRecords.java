package com.amigoscorp.algos.hackerrank;

import java.util.Scanner;

public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];
        int minScore = scores[0];
        int maxScore = scores[0];
        for (int index = 1; index < scores.length; index++) {
            if (maxScore > scores[index]) {
                result[1]++;
                maxScore = scores[index];
            } else if (minScore < scores[index]) {
                result[0]++;
                minScore = scores[index];
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);
        for (int element : result) {
            System.out.println(element);
        }
    }
}
