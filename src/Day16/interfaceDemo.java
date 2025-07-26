package Day16;

interface Shape{
	int length=10;     //by default it is final and static
	int width=20;		//by default it is final and static
	
	void area();		//Abstract method
	default void circle() {   //default method
		System.out.println("circle default method from interface");
	}
	static void rectangle() {   //static method
		System.out.println("Rectangle static method from interface");
	}
}

public class interfaceDemo implements Shape{
	
	public void area() {
		System.out.println("area abstarct method implemented in class");
	}
	
	void triangle() {
		System.out.println("triangle from class");
	}

	public static void main(String[] args) {
		interfaceDemo id= new interfaceDemo();
		id.area();
		id.circle();
		Shape.rectangle();
		id.triangle();
		System.out.println(Shape.length+" "+Shape.width);
		
		Shape sh=new interfaceDemo();
		sh.area();
		sh.circle();
		Shape.rectangle();
		// sh.triangle(); cannot be called because triangle does not belong to Shape interface
		System.out.println(Shape.length+" "+Shape.width);
		

	}

}
