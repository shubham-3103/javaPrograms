package com.edu.MavenTest;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1}; // Example array with duplicates
        int[] result = removeDuplicates(array);
        System.out.println("Updated Array: " + Arrays.toString(result));
        System.out.println("Length: " + result.length);
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        if (n == 0 || n == 1)
            return arr;

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return Arrays.copyOf(arr, j);
    }
}
