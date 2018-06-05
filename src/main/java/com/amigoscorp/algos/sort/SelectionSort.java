package com.amigoscorp.algos.sort;

public class SelectionSort {
    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimumElementIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minimumElementIndex] > array[j]) {
                    minimumElementIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimumElementIndex];
            array[minimumElementIndex] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        sort(new int[]{9, 3, 2, 11, 5});
    }
}
