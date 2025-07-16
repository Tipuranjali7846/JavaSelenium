package Day9;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String:");
		String s= sc.nextLine();
		String Rev="";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(i);
			Rev=Rev+s.charAt(i);			
		}
		System.out.println(Rev);
		
		if(s.equalsIgnoreCase(Rev)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given String is not Palindrome");
		}

	}

}
