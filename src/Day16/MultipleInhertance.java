package Day16;

public class MultipleInhertance implements I1,I2 {

	public void m1() {
		System.out.println("Abstract class m1");
	}
	
	public void m2() {
		System.out.println("Abstract class m2");
	}
	public static void main(String[] args) {
		MultipleInhertance mi=new MultipleInhertance();
		mi.m1();
		mi.m2();
		System.out.println(I1.a);
		System.out.println(I2.b);
		

	}

}
