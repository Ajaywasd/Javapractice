package pack;

import java.util.Scanner;

public class FIbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.println("enter number of terms"); 
		int number = 6;
		int first = 0, second = 1, next; 
		System.out.println("Fibonacci series is "); 
		for ( int i = 0; i<=number; i++)
		{
		System.out.println(first + ""); 
		next = second+first;
		first = second; 
		second = next;
		}
		}
}
