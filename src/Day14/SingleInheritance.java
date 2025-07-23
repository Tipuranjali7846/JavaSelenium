package Day14;

// single parent and single child

class A{
	int a;
	void display() {
		System.out.println("i am in class A");
	}
}

class B extends A{
	int b;
	void show() {
		System.out.println("i am in class B");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		B objb=new B();
		System.out.println(objb.b);
		System.out.println(objb.a);
		objb.display();
		objb.show();
		

	}

}
