package Day15;

class ABC{
	void m1() {
		System.out.println("in m1 method");
	}
	
	void m2() {
		System.out.println("in m2 method");
	}
	
	void m2(int i) {
		System.out.println("in m2 method overloading"+i);
	}
}

class XYZ extends ABC{
	void m1() {			//overriding
		System.out.println("in m1 method overriding");
	}
	void m2() {			//overriding
		System.out.println("m2 method in xyz class");
	}
}

public class OverLoadingVsOverRiding {
	
	public static void main(String[] args) {		
		XYZ obj1= new XYZ();
		obj1.m2(20);
		obj1.m1();
		obj1.m2();
		
	}

}
