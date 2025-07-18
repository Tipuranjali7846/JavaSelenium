package Day12;

public class CallByValue {

	public static void main(String[] args) {
		int num=100;
		Test test=new Test();
		System.out.println("Before Method:"+num);
		test.m1(num);
		System.out.println("AfterMethod:"+num);

	}

}
