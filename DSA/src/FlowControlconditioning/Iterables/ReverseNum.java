package FlowControlconditioning.Iterables;

import java.util.Scanner;

public class ReverseNum {
    public static int reverse(int n){

    Scanner sc = new Scanner(System.in);
    int rev=0;
    
    while(n>0){
        int digit=n%10;
        rev = rev * 10 + digit;
        n = n/10;
        }
        return rev;
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int rev = reverse(n); 

System.out.println("The reverse of number is: " +rev);
}
}
