package Day18;

//A b=(C) d;

public class TypecsatingObject2 {

	public static void main(String[] args) {
		/*Ex:1
		Object o = new String("Welcome");
		StringBuffer sb= (StringBuffer)o; //Rule1 //Rule2 //Rule3-Failed
		*/
		
		/*Ex:2
		String s = new String("Welcome");
		StringBuffer sb= (StringBuffer)s; //Rule1-failed
		*/
		
		//Ex:3
//		Object o = new String("Welcome");
//		StringBuffer sb= (String)o;  // Rule:1 Rule2-failed
		
		//Ex4:
		//String s = new String("Welcome");
		//StringBuffer sb= (String)s; //Rule1 Rule2-Failed
		
//		Ex:5
		Object o= new String("Welcome");
		String sb= (String)o;  //Rule1 Rule2 //Rule3
		System.out.println(sb);
		
		Object ob= new Object();
		String s=(String)ob;
		System.out.println(s);
		
		

		
		
	}

}
