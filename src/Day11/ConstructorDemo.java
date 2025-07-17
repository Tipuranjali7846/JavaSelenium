package Day11;

public class ConstructorDemo {
	int a;
	int b;
	ConstructorDemo() {
		int x=10;
		int y=20;
		System.out.println("i am default constructor");
	}
	
	ConstructorDemo(int x, int y){
		a=x;
		b=y;
		System.out.println("i am parameterised constructor");
	}
	
	void sum() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		ConstructorDemo CD= new ConstructorDemo();
		ConstructorDemo CD1= new ConstructorDemo(100,200);
		CD1.sum();

	}

}
