package firstProject.com;

public class JavaOperators {

	public static void main(String[] args) {
		int a=30 , b=5;
		
		//Arthematic operetors + - * / %
		
		System.out.println("Sum of "+(a+b));
		System.out.println("Sub of "+(a-b));
		System.out.println("Mul of "+(a*b));
		System.out.println("Div of "+(a/b));
		System.out.println("Modulo div of "+(a%b));
		
		//Relational/comparison operators > < >= <= == !=
		//Returns boolean value True or False
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		// Logical operators && || ! 
		//only works with boolean values
		
		boolean c= true, d=false;
		
		
		System.out.println(c&&d);
		System.out.println(c||d);
		System.out.println(!c);
		System.out.println(!d);
		
		
		
		

	}

}
