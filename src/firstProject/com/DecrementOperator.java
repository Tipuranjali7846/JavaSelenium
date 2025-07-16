package firstProject.com;

public class DecrementOperator {

	public static void main(String[] args) {
		int a = 10;

		int b = a - 1;
		System.out.println(b); //9

		// post decrement -- when stored in another variable
		// first assignment and then decrement

		// post decrement

		System.out.println(--a); // a=9

		int c = a--;
		System.out.println("c=" + c); // returns 9

		// pre decrement
		int d = --a;
		System.out.println("d=" + d); //7

	}

}
