package pack;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in); 
		System.out.print("Enter the first number: "); 
		int a = 10;
		System.out.print("Enter the second number: "); 
		int b = 120;
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping: a = " + a + ", b = " + b);
		}
		}
