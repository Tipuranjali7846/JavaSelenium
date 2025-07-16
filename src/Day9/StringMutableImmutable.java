package Day9;

public class StringMutableImmutable {

	public static void main(String[] args) {
		//String is immutable
		
		String s= "Welcome";
		s.concat("To Java");
		System.out.println(s);
		
		//String Buffer is muttable
		StringBuffer SB= new StringBuffer("I am Good");
		SB.append("in Java");
		System.out.println(SB);
		
		//String Builder is muttable
		StringBuilder sb= new StringBuilder("My elder daughter");
		sb.append("Mokshita Lakshmi");
		System.out.println(sb);
		

	}

}
