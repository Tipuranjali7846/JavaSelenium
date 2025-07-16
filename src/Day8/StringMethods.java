package Day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welcome";
		String w= new String("Welcome");
		String k= "javaSelenium@gmail.com";
		System.out.println(s);
		System.out.println(w);
		System.out.println(s.length());
		System.out.println(s.concat(w));
		System.out.println(s.trim());
		System.out.println(s.charAt(4));
		System.out.println(s.contains("com"));
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.equals(w));
		System.out.println(s.equalsIgnoreCase(w));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(Arrays.toString(k.split("@")));
		System.out.println(s.substring(4));

	}

}
