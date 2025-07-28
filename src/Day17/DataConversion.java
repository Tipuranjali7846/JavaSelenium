package Day17;

public class DataConversion {

	public static void main(String[] args) {
		//Scenario1
		// String ---- int,double,boolean,char -----> unboxing
		String s = "Welcome"; // cannot convert

		// string to int
		String s1 = "123";
		int i = Integer.parseInt(s1);
		System.out.println(i);

		// string to double
		String s2 = "10.5";
		double d = Double.parseDouble(s2);
		System.out.println(d);

		// string to boolean
		String s3 = "true";
		boolean b = Boolean.parseBoolean(s3);
		System.out.println(b);

		// string to char
		String s4= "a"; // cannot convert string to char because char allows single letter
		
		//Scenario2:		
		// int,double,boolean,char ---- String -----> Autoboxing
		
		int ivalue=10;
		String i1=String.valueOf(ivalue);
		double dval=12.5;
		String i2=String.valueOf(dval);
		System.out.println(i1+" "+i2);
		
		
		

	}

}
