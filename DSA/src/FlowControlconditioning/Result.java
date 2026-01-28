package FlowControlconditioning;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        int grade = marks/10;

        switch(grade){
            case 1: 
            if(marks>=90)
            System.out.println("Grae A");
            break;
            case 2:
                System.out.println("Grade B");
            break;
        }}}
        



