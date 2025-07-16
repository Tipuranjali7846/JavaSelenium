package Day9;

public class ReverseString {

	public static void main(String[] args) {
		//Method-1 by length(), charAt() methods
		
		String s="Selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse1"+rev);
		
		
		//Method-2 by converting string to array
		
		char c[]=s.toCharArray();
		for(int j=c.length-1;j>=0;j--) {
			rev=rev+c[j];
		}
		System.out.println("Reverse2"+rev);
		
		//method-3 by using StringBuffer class
		
		StringBuffer sb1=new StringBuffer("Welcome");
		System.out.println(sb1.reverse());
		
		//Method-4 by using StringBuilder class
		
		StringBuilder sb2= new StringBuilder("Java");
		System.out.println(sb2.reverse());
		
		
		
		

	}

}
