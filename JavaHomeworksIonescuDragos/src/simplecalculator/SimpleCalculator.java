package simplecalculator;

/**
 * @author Ionescu Dragos
 */

import java.util.Scanner;

public class SimpleCalculator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double n1, n2;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter first number");
        n1 = scannerObject.nextDouble();

        System.out.println("Enter second number");
        n2 = scannerObject.nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();

        switch (operation)  {
        case "+":
            System.out.println("Your answer is " + (n1 + n2));
            break;

        case "-":
            System.out.println("Your answer is " + (n1 - n2));
            break;

        case "/":
            if (n2 != 0){
            System.out.println("Your answer is " + (n1 / n2));
            }
            else 
                System.out.println("operati1on invalid");
            break;
            
        case "*":
            System.out.println("Your asnwer is " + (n1 * n2));
            break;

        default:
            System.out.println("Please select a valid operation");

        }
    }
}