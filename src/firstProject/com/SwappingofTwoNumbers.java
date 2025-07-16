package firstProject.com;

public class SwappingofTwoNumbers {

	public static void main(String[] args) {
		int a=10, b=20, c;
	/*	c=a;
		a=b;
		b=c;
		
		System.out.println("a="+a);//20
		System.out.println("b="+b);//10 */
		
		a=(a>b)?a:b;
		System.out.println("a="+a);//20
		b=(b<=a)?10:20;
		System.out.println("b="+b);//10
		
		
				

	}

}
