package Day18;

public class TypeCastingConcept {
	
	//Upcasting-- Converting smaller value to larger value
	//int---long
	//float--double
	
	//Downcasting-- Converting larger value to small value
	//long-----int
//	double ---- float
	
	

	public static void main(String[] args) {
		//upcasting---Automatic--- smaller to larger
		int i=10;
		long l=i;
		System.out.println(l);
		
		float f=10.5F;
		double d=f;
		System.out.println(d);
		
		//downcasting -- manually--- larger to smaller
		long longV=100000;
		int intV=(int)longV;
		System.out.println(intV);
		
		double doubleValue=12324345355.99;
		float floatValue=(float)doubleValue;
		System.out.println(floatValue);
		
		

	}

}
