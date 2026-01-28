package FlowControlconditioning;

public class Calculator {
    public static void main(String[] args) {
        int a=6;
        int b=4;
        char choice = '+';
        int result;

        switch (choice) {
            case '+':
                result=a+b;
                System.out.println("Add:"+result);
                break;
                case '-':
                result=a-b;
                System.out.println("Subtract:"+result);
                break;
                case '*':
                result=a*b;
                System.out.println("Mul:"+result);
                break;
            
        }
    }
    
}
