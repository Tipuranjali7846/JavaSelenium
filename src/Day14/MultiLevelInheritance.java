package Day14;

// multi level inheritance we can have n number of parents and n number of child class
// combining multiple single inheritance is called multilevel inheritance.

class Aa{
	int a;
	void display() {
		System.out.println("i am in class A"+a);
	}
}

class Bb extends Aa{
	int b;
	void show() {
		System.out.println("i am in class B"+b);
	}
}

class Cc extends Bb{
	int c;
	void paint() {
		System.out.println("i am in class C"+c);
	}
}

public class MultiLevelInheritance {
	

	public static void main(String[] args) {
		
		Cc objc= new Cc();
		objc.a=100;
		objc.b=200;
		objc.c=300;
		objc.display();
		objc.show();
		objc.paint();
		

	}

}
