 package Array;

    import java.util.Scanner;

public class SecondLargest {

    // Method to find the second largest element
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest; // previous largest becomes second largest
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // Method to take input from user
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();

        int result = findSecondLargest(arr);
        if (result == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest: " + result);
        }
    }
}
