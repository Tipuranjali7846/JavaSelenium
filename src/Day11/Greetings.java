package Day11;

public class Greetings {
	//1) No Params and no return value
	
	void m1() {
		System.out.println("hello");
	}

	//2)No params having return value
	
	String m2() {
		return "Hello java";
	}
	
	//3)Having params and no return value
	
	void m3(String name) {
		System.out.println("Hello "+ name);
	}
	
	//4)Having params and returns value
	
	int addition(int a, int b) {
		return a+b;
	}
}
