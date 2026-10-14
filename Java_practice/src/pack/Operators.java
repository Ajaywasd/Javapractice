package pack;

import java.util.Scanner;

public class Operators {
	
	String  name = "ajay12$";
	
	
	public void name1() {
		
				int a=10; 
				int b=5;
				
				int c= a+b;
				
				System.out.print(c);
		
		
	}
	
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
      
      Operators op= new Operators();
      
      op.name1();
      
      System.out.println();
      
      System.out.println(op.name.length());

        System.out.println("=== Java Switch & Scanner Calculator ===");

        // 1. Get the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // 2. Get the operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // 3. Get the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double result;

        // 4. Use switch case to determine which arithmetic operator to apply
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                // Handle division by zero scenario
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            // Handle invalid operator input
            default:
                System.out.println("Error: Invalid operator entered.");
                break;
        }

        // Close the scanner resource
        scanner.close();
    }
}
