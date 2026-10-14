package pack;

public class array {

	 public static boolean isPrime(int num) {
	        // Numbers less than or equal to 1 are not prime
	        if (num <= 1) {
	            return false;
	        }
	        
	        // Check for factors up to the square root of the number
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false; // Found a factor, so it's not prime
	            }
	        }
	        return true; // No factors found, it is prime
	    }

	    public static void main(String[] args) {
	        // Define an array with mixed numbers
	        int[] numbers = {2, 4, 7, 10, 11, 15, 19, 1, 0, -5};

	        System.out.println("Checking numbers in the array:\n");

	        // Loop through each element in the array
	        for (int num : numbers) {
	            if (isPrime(num)) {
	                System.out.println(num + " is a prime number.");
	            } else {
	                System.out.println(num + " is NOT a prime number.");
	            }
	        }
	    }
	}