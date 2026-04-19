package com.sunbeam;
import java.util.Arrays;

public class ModeExample {
    public static int findMode(int[] arr) {
        Arrays.sort(arr);

        int mode = arr[0], maxCount = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        return mode;
    }
}