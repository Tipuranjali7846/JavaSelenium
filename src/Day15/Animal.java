package Day15;

class Animal {
	String color = "white";

	void display() {
		System.out.println(color);
	}
	
	Animal(){
		System.out.println("eating...");
	}

}

class Dog extends Animal {
	String color = "brown";

	void display() {
			System.out.println(super.color);
	}
	
	Dog(){
		System.out.println("Dog is eating...");
	}

}

class Elephant extends Animal {
	String color = "black";

	void display() {
		super.display();
	}
	
	Elephant(){
		System.out.println("Elephant is eating...");
	}
}
