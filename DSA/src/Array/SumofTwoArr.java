package Array;

import java.util.Scanner;

public class SumofTwoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxsize=5;

        System.out.println("Enter aray size: ");
        int size= sc.nextInt();

        int[] A= new int[size] ;
        int[] B= new int[size] ;
        int[] C= new int[size] ;
        
        System.out.println("Enter Array A: ");
        for (int i = 0; i < size; i++) {
           A[i]=sc.nextInt(); 
        }
        System.out.println("Enter array B: ");
        for (int i = 0; i < size; i++) {
           B[i]=sc.nextInt(); 
        }
        for (int i = 0; i < size; i++) {
           C[i]=A[i]+B[i];
        }
    
    System.out.println("Sum of 2 Array is: ");
    for(int i=0;i< size;i++){
        System.out.println(C[i]+"");
    }
}}
