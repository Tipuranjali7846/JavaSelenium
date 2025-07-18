package Day12;

public class ConstructorOverloading {
	
	ConstructorOverloading() {
		System.out.println("default constroctor");
	}
	
	ConstructorOverloading(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		ConstructorOverloading COL= new ConstructorOverloading();
		ConstructorOverloading COL1= new ConstructorOverloading("Learn java");
	}

}
