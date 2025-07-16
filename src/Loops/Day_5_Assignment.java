package Loops;

public class Day_5_Assignment {

	public static void main(String[] args) {

		// Assignment1: Reverse a given number

//		int n = 2345045;

//		System.out.println(n % 10);
//		System.out.println(n / 10);

		/*
		 * for (int i = 0; n>0; i++) { System.out.print(n % 10); n = n / 10;
		 * 
		 * 
		 * }
		 */

		// Assignment2: check number Palindrome or not

		/*
		 * int n=122; int k=n; int rev=0; for (int i=0;n>0;i++) { rev=rev*10+n%10;
		 * System.out.println(rev); n/=10; } System.out.println("n"+n);
		 * System.out.println("rev"+rev); if(k==rev) { System.out.println("palindrome");
		 * } else { System.out.println("Not palindrome"); }
		 */

		// Assignment3:Count number of digits in a number

		/*
		 * int n=126789034; int k=0;
		 * 
		 * for( int i=1;n>0;i++) { n=n/10; k=i; }
		 * System.out.println("Count of given number"+k);
		 * 
		 */

		// Assignment4:Count no.of even and odd numbers in a digit

	/*	int n = 123456, k;
		int even = 0, odd = 0;

		for (int i = 1; n > 0; i++) {
			k = n % 10;

			if (k % 2 == 0) {
				even = even + 1;
			} else {
				odd = odd + 1;
			}
			n = n / 10;
		}
		System.out.println(even + "Even numbers");
		System.out.println(odd + "Odd numbers");
		*/
		
		//Find sum of digits in a number
		
		int n= 234567, k=0, s=0;
		
		for (int i=0; n>0;i++) {
			k=n%10;						
			n=n/10;			
			s=s+k;					
		}
		System.out.println("Sum of given number is---"+s);	
		
		

	}
}
