package Day15;
class Bank {
	double roi() {
		return 0;
	}
}

class ICICI extends Bank {
	double roi() {
		return 10.5;
	}
}

class SBI extends Bank {
	double roi() {
		return 12.5;
	}
}


public class MethodOverRiding {
	
	public static void main(String[] args) {

		ICICI ic=new ICICI();
		System.out.println(ic.roi());

	}

}
