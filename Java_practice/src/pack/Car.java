package pack;

import java.lang.classfile.Superclass;

public class Car extends Vehicle {

//	Car(){
//		
//		System.out.println("constructed called");
//	}
	public void speed() {
		
	
		System.out.println("150 kms");
	}
	
	public boolean speed(boolean max) {
		System.out.println("speed maxium reach");
		return max;
	}
	@Override
	public void colour() {
		super.colour();
		System.out.println("red");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car mycar = new Car();
mycar.speed();
mycar.speed(false);
mycar.horn();
mycar.apply_break();
mycar.colour();

	}

}
