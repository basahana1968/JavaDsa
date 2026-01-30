package Array;

import java.util.Scanner;

public class LeftRotationByK {

    // Time Complexity: O(n + k)
    // Space Complexity: O(k)
    public static void bruteForce(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return; // safety check
        k = k % n;          // handle k > n

        int[] temp = new int[k];

        // Step 1: storing first k elements
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: moving elements to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: placing temp elements at the end
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        bruteForce(arr, k);  // Call the fixed method

        System.out.println("Array after left rotation by k:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
