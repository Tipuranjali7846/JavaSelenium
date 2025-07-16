package firstProject.com;

public class TernaryOperator {

	public static void main(String[] args) {
		// Syntax var= exp? result1: result2;
		
		int a=20,b=30;
		
		//ex1
		int res= a>b?a:b;
		System.out.println(res);//30
		
		int person_age=20;
		String check= person_age>=18?"Eligible":"NotEligible";
		System.out.println(check);// Eligible

	}

}
