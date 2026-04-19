package com.sunbeam;
public class LastOccurrence {

    public static int findLastOccurrence(int[] arr, int key) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;   
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int key = 2;

        int result = findLastOccurrence(arr, key);

        if (result != -1)
            System.out.println("Last occurrence of " + key + " is at index " + result);
        else
            System.out.println("Element not found");
    }
}