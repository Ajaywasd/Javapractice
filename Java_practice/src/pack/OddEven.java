package pack;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner Scan = new Scanner(System.in);
       System.out.println("Enter the number");
       int a=Scan.nextInt();
       if (a == 0 ) {
       System.out.println("number is even");
	}
       else
       {
    	   System.out.println("number is odd");
       }

}
}