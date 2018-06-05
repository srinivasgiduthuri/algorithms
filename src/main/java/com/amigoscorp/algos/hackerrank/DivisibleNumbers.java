package com.amigoscorp.algos.hackerrank;

import java.io.IOException;
import java.util.Scanner;

/**
 * Given an integer, n, find the smallest integer m such that m is divisible by n (i.e., n is a factor of m) and satisfies the following properties:

 m must not contain zeroes in its decimal representation.
 The sum of m's digits must be greater than or equal to the product of m's digits.

 Given n, find m and print the number of digits in m's decimal representation.

 Input Format

 A single integer denoting n.

 Constraints
 1 <= n <= 3 * 10^4
 n is not divisible by 10.
 Time Limits

 The time limits for this challenge are available here.
 Output Format

 Print the number of digits in the decimal representation of the smallest possible m.
 */
public class DivisibleNumbers {
    static int divisibleNumbers(int n) {
        return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scanner.nextLine().trim());
        int result = divisibleNumbers(n);
        System.out.println(result);
    }
}
