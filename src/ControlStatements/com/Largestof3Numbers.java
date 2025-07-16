package ControlStatements.com;

public class Largestof3Numbers {

	public static void main(String[] args) {
		int a=10,b=20,c=5;
		if(a>b&&a>c) {
			System.out.println("greatest number is--"+a);
		}else if(b>a && b>c) {
			System.out.println("greatest number is--"+b);
		}else {
			System.out.println("greatest number is--"+c);
		}
	}

}
