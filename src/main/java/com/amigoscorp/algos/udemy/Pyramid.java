package com.amigoscorp.algos.udemy;

/*
1,1
#
2,3
-#-
###
3,5
--#--
-###-
#####
4,7
---#---
--###--
-#####-
#######

*/
public class Pyramid {
    private static void printPyramid(int numberOfSteps) {
        int midpoint = (int) Math.floor((2 * numberOfSteps - 1) / 2);
        for (int row = 0; row < numberOfSteps; row++) {
            for (int column = 0; column < 2 * numberOfSteps - 1; column++) {
                if (midpoint - row <= column && midpoint + row >= column) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printPyramidRecursive(int numberOfSteps, int row, String step) {
        if (row == numberOfSteps) {
            return;
        }
        if (step.length() == 2 * numberOfSteps - 1) {
            System.out.println(step);
            printPyramidRecursive(numberOfSteps, row + 1, "");
            return;
        }
        int midpoint = (int) Math.floor((2 * numberOfSteps - 1) / 2);
        if (midpoint - row <= step.length() && midpoint + row >= step.length()) {
            step += "#";
        } else {
            step += " ";
        }
        printPyramidRecursive(numberOfSteps, row, step);
    }

    public static void main(String[] args) {
        printPyramid(5);
        printPyramidRecursive(5, 0, "");
    }
}
