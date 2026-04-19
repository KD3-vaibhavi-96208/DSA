package com.sunbeam;

public class NthOccurrence {

    public static int findNthOccurrence(int[] arr, int key, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;

                if (count == n)
                    return i;   // return index
            }
        }

        return -1;  // nth occurrence not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int key = 2;
        int n = 3;

        int result = findNthOccurrence(arr, key, n);

        if (result != -1)
            System.out.println(n + "th occurrence of " + key + " is at index " + result);
        else
            System.out.println("Occurrence not found");
    }
}