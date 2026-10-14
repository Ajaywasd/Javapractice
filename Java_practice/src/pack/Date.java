package pack;
import java.util.Scanner;

public class Date {
    static  String name="Helloworld";
	public static void name1() {
		// TODO Auto-generated method stub
            int a,b,c;
            a=5;
            b=6;
            c=a*b;
           
         
            System.out.println(c);
            System.out.println("The multiplication of " +c);		
            
	}

public static void name11(int z) {
	//int z=2;
	float x=5.46F;		
	float v=z+x;
	System.out.println(v);
	
	
	
	
}	

public static void name11(float z) {
	//int z=2;
	float x=10.46F;		
	float v=z+x;
	System.out.println(v);
	
	
	
	
}



	
public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	//Date wasd = new Date();
	
	Date.name1();
	System.out.println();
	
	 int len=Date.name.length();
    
    //System.out.println();
    //System.out.println(Date.name.toUpperCase());
    //System.out.println(Date.name.toLowerCase());
  Date.name1();
    Date.name11(2);
	
}
}