package pack;

import java.util.Scanner;

public class Swap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the first number: ");
		int a = scanner.nextInt();
		
		System.out.print("Enter the second number: "); 
		int b = scanner.nextInt();
		
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		 int temp = a;
	        a = b;
	        b = temp;
		System.out.println("After swapping: a = " + a + ", b = " + b);
		}
		}
