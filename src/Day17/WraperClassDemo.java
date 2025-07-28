package Day17;

public class WraperClassDemo {

	public static void main(String[] args) {
		//Converting primitive data types in to object -- Autoboxing
		
		//primitive variables
		int i=10;
		double d=10.5;
		char c='A';
		boolean b=true;
		
		//converting into object
		Integer iobj=i;
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//Converting object to primitive data types -- unboxing
		
		int inti= iobj;
		double doubled=dobj;
		char characterc=cobj;
		boolean boolb=bobj;
		 
		System.out.println(inti);
		System.out.println(doubled);
		System.out.println(characterc);
		System.out.println(boolb);		

	}

}
