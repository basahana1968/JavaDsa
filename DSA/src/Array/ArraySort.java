package Array;

import java.util.Scanner;

public class ArraySort {

    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if array is sorted
        if (isSorted(arr)) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is NOT sorted");
        }

        sc.close();
    }
}

