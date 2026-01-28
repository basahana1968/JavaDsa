package FlowControlconditioning.Iterables;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number");
        int num= sc.nextInt();
        int result=1;

        for(int i=1;i<=num;i++){
            result=result*i;
            }
            System.out.println("Factorial:"+result);
    }
    
}
