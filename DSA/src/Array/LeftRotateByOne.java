package Array;

import java.util.Scanner;

public class LeftRotateByOne {

    public static void solution(int[] arr) {

        if (arr.length == 0) return; // safety check

        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
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

        solution(arr);

        System.out.println("Array after left rotation by one:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
