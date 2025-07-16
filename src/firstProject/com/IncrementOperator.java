package firstProject.com;

public class IncrementOperator {
	public static void main(String[] args) {
		
		int a=10;
		
		int b=a+1;
		System.out.println(b);
		
		//post increment -- when stored in another variable 
		//first assignment and then increment
		
		// post increment
		
		System.out.println(++a); //a=11
		
		int c=a++;
		System.out.println("c="+c); // returns 11	
		
		// pre increment
		int d=++a;
		System.out.println("d="+d);
	}

}
