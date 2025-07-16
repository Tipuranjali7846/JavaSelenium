package Day7;

import java.util.Scanner;

public class TakeInputFromConsole {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number:");
		int a=sc.nextInt();
		System.out.println("Enter double value:");
		double b= sc.nextDouble();
		System.out.println("Enter string value:");		
		String s= sc.next();
		System.out.println(a+b+s);

	}

}
