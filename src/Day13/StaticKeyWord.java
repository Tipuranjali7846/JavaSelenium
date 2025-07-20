package Day13;

public class StaticKeyWord {
	static int a=10;			//static variable
	int b=20;					//Non-static variable
	
	static void m1() {
		System.out.println("i am in static method");
	}
	
	void m2() {
		System.out.println("i am in non-static method");
	}
	
	void m3() {
		System.out.println(a+"  "+b);
		m1();
		m2();
		
	}

	public static void main(String[] args) {
		System.out.println(a);
		m1();
		
		StaticKeyWord sk= new StaticKeyWord();
		System.out.println(sk.b);
		sk.m2();
		
		sk.m3();
		
		
		
		

	}

}
