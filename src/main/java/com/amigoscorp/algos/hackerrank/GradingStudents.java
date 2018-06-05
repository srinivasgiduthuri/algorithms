package com.amigoscorp.algos.hackerrank;

import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {
    /*
     * Complete the gradingStudents function below.
     */
    private static int[] gradingStudents(int[] grades) {
        int[] validGrades = new int[grades.length];
        for (int gradeIndex = 0; gradeIndex < grades.length; gradeIndex++) {
            if (grades[gradeIndex] >= 38) {
                if (grades[gradeIndex] % 5 == 0) {
                    validGrades[gradeIndex] = grades[gradeIndex];
                    continue;
                }
                int roundedGrade = 5 * ((grades[gradeIndex] / 5) + 1);
                if (roundedGrade - grades[gradeIndex] < 3) {
                    validGrades[gradeIndex] = roundedGrade;
                } else {
                    validGrades[gradeIndex] = grades[gradeIndex];
                }
            } else {
                validGrades[gradeIndex] = grades[gradeIndex];
            }
        }
        return validGrades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }
        int[] result = gradingStudents(grades);
        for (int grade : result) {
            System.out.println(grade);
        }
    }
}
