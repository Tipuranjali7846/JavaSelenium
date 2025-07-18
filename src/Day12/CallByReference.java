package Day12;

public class CallByReference {

	public static void main(String[] args) {
		Test test=new Test();
		test.number=100;
		System.out.println("BeforeMethod:"+test.number);
		test.m2(test);
		System.out.println("AfterMethod:"+test.number);

	}

}
