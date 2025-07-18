package Day12;

public class Test {
	int number;
	
	void m1(int number) {
		number= number+10;
		System.out.println("Within the method m1:"+number);
	}
	
	void m2(Test t) {
		t.number= t.number+10;
		System.out.println("Within the method m2:"+t.number);
	}

}
