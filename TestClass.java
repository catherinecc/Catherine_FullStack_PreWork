package test;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int choice = 10;
		do {
			System.out.println("Please enter your choice from the following:" + "\n1.  Check for palindrome number\n"
					+ "2. Prints the pattern of stars in decreasing order based on the input\n"
					+ "3. Check whether the input number is a prime number\n"
					+ "4. Print Fibonacci series of size n with first two numbers as 0, 1"
					+"\n ********** Press 0 to exit ************ s");
			
			choice = in.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Exiting Program.");
				break;
			
			
			case 1: {

				System.out.println("\n Enter the number to check");
				int n = in.nextInt();
				checkPalindrome(n);
				break;
			}
			case 2: {

				System.out.println("\n Enter the number of stars in first row");
				int n = in.nextInt();
				printStars(n);
				break;
			}
			case 3: {

				System.out.println("\n Enter the number to check for prime");
				int n = in.nextInt();
				checkPrime(n);
				break;
			}

			case 4: {

				System.out.println("\n Enter the size of fibonacci series");
				int n = in.nextInt();
				printFibonacci(n);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} while (choice != 0);
		in.close();
		System.out.println("Program terminated");
	}

	private static void printFibonacci(int n) {
		
		System.out.println(0);
		System.out.println(1);
		
		int n1 = 0;
		int n2=1;
		for(int i=2;i<n; i++) {
			int n3 = n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	

	}

	private static void checkPrime(int n) {
		
		boolean isPrime=true;
		for(int i=2;i<n/2;i++) {
			
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(n+"is Prime");
		}else {
			System.out.println(n+"is not Prime");
		}

	}

	private static void printStars(int n) {
		for(int i=n;i>0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	private static void checkPalindrome(int n) {
		int original=n;
		int reverse = 0;
		while(n>0) {
			reverse= reverse*10+ n%10;
			n=n/10;
			
		}
		
		System.out.println(reverse);
		
		
		if(original== reverse) {
			System.out.println(original +"is a palindrome");
		}
		else
		{
			System.out.println(original + "not palindrome");
		}

	}

}
