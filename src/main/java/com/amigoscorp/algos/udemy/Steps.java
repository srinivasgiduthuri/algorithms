package com.amigoscorp.algos.udemy;

public class Steps {
    private static void printSteps(int numberOfSteps) {
        for (int fillCharIndex = 1; fillCharIndex <= numberOfSteps; fillCharIndex++) {
            for (int fillSpaceIndex = 1; fillSpaceIndex <= numberOfSteps; fillSpaceIndex++) {
                if (fillSpaceIndex <= fillCharIndex) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printStepsRecursion(int numberOfSteps, int row, String step) {
        if (numberOfSteps == row) {
            return;
        }

        if (numberOfSteps == step.length()) {
            System.out.println(step);
            printStepsRecursion(numberOfSteps, row + 1, "");
            return;
        }

        if (step.length() <= row) {
            step += "#";
        } else {
            step += " ";
        }

        printStepsRecursion(numberOfSteps, row, step);
    }

    public static void main(String[] args) {
        printSteps(5);
        System.out.println();
        printStepsRecursion(5, 0, "");
    }
}
