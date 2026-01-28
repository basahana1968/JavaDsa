package FlowControlconditioning;

import java.util.Scanner;

public class SunEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int evenSum=0;
        int oddSum=0;

        for(int i=1;i<=n;i++)
            if(i % 2==0){
                evenSum+=i;
                oddSum+=i;
            }
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
    }
    
}
