package Day18;
class Parent{
	int x=100;
	void m1() {
		System.out.println("i am parent of m1...");
	}
	
}

class Child extends Parent{
	int y= 200;
	void m2() {
		System.out.println("I am child of m2...");
		
	}
	
}

public class TypeCastingObjects {
	
	public static void main(String[] args) {
		Child ch= new Child();
		System.out.println(ch.x);
		ch.m1();
		System.out.println(ch.y);
		ch.m2();
		
		//upcasting
		Parent p=new Child();
		System.out.println(p.x);
		p.m1();
//		System.out.println(p.y); cannot access
//		p.m2();
		
		//downcasting
		Child c =(Child)new Parent();
//		Child c=(Child)p;
		System.out.println(c.x);
		System.out.println(c.y);
		c.m1();
		c.m2();
		
		
		

	}

}
