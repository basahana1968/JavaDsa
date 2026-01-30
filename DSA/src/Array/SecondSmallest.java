package Array;
    import java.util.Scanner;
public class SecondSmallest {
    
    // Method to find the second smallest element
    public static int findSecondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest; // previous smallest becomes second smallest
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] > smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }

    // Method to take input from the user
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

        int result = findSecondSmallest(arr);
        if (result == Integer.MAX_VALUE) {
            System.out.println("No second smallest element found.");
        } else {
            System.out.println("Second smallest: " + result);
        }
    }
}