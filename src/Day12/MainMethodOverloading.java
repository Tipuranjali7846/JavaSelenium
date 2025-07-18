package Day12;

public class MainMethodOverloading {
	void main(int b) {
		System.out.println(b);
	}
	
	void main(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		MainMethodOverloading m=new MainMethodOverloading();
//		String a[]={"anjali","Tipura"};
		m.main(10);
		m.main("learning lava");
//		m.main(a);
		// if we call main method by passing an array it is repeatedly calling and stack over flow error
		
	}

}
