package Day15;

final class Morning{
	final int time =9;
	final void display() {
		System.out.println(time);
	}
	
}

//class Afternoon extends Morning{ Here morning class cant be override because its is having final modifier
//	int time=12;
////	void display() {        Here display method cant be override because its is having final modifier
////		// super.time=1;         Here time variable cant be override because its is having final modifier
////		super.display();
////		System.out.println(time);
////	}
	
//}

public class FinalKeyword {

	public static void main(String[] args) {
//		Afternoon af = new Afternoon();
//		af.time=1230;
//		af.display();
		

	}

}
