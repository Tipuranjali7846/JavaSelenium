package Day18;

class Animal{}

class Dog extends Animal{}
class Cat extends Animal{}
	
public class TpeCastingObject1 {

	public static void main(String[] args) {
		
		//Rule1: Conversion is valid or not
		// c and d should have some relation ship parent---child or viceversa
//		Animal an=new Animal();
//		Cat c=(Cat)an;
		Cat c= new Cat();
		
		
		//Rile2: Assignment is valid or not
		//c must be same or either child of A
		Animal an1=new Dog();
		Dog d=(Dog)an1;
		
		
		//Rule3:
		//The underlaying object type of d must be same or child of c
		Animal a=new Cat();
		Cat c1= (Cat)a;
		
		
		//Rule1,Rule2,Rule3
		
		Animal ai=new Dog();
		Dog dg=(Dog)ai;
	

	}

}
