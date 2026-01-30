package Array;

import java.util.Scanner;

public class ArrayIO {
    public static void main(String[] args) {
        
        int arr[] = new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size=sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter element index: "+i);
            arr[i]=sc.nextInt();
            
        }
        for(int i = 0; i < size; i++){
            System.err.println(arr[i] +" ");
        }
    }
    
}
