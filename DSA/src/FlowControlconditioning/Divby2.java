package FlowControlconditioning;
import java.util.Scanner;

public class Divby2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();

        if(num % 2 == 0){
            System.out.println("This num is Even");
        }
            else{
            System.out.println("This num is odd");
        }
    }
}
