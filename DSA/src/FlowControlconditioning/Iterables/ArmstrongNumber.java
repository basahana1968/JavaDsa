package FlowControlconditioning.Iterables;

import java.util.Scanner;

public class ArmstrongNumber {
    
    public static int count(int n){
            int count=0;
            while(n>0){
                count++;
                n=n/10;
            }
            return count;
        }
        
        public static boolean isArmstrong(int n){
        //int digits=count(n);
        String str=String.valueOf(n);
int count =str.length();

        int current = n;
        int sum= 0;
        while(current>0){
            int digit = current%10;
            sum += (int)Math.pow(digit,digits);
            current = current/10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // System.out.println("enter a number");
            // int n =sc.nextInt();

            // if(isArmstrong(n)){
            //     System.out.println("It is an Armstrong");
            // }else{
            //     System.out.println("It is not an Armstromg");
            // }
            for(int i=1;i<=1000;i++){
                if (isArmstrong(i)) {
                System.out.println(i);

            }
             }

            }}

 