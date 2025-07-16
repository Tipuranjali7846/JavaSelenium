package ControlStatements.com;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findLargest();
		leastNum(20, 37, 17);
		weekNmaesUsingSwitch("Monday");

	}

	public static void findLargest() {
		int a = 10, b = 20;

		if (a > b)
			System.out.println("largest nuber is a");
		else {
			System.out.println("largest number is b");
		}

		String largetNum = a > b ? "LargestNum is a" : "LargestNum is b";
		System.out.println(largetNum);

	}

	public static void leastNum(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("a is the smallest number");
		} else if (b < c && b < a) {
			System.out.println("b is the smallest number");
		} else {
			System.out.println("c is the smallest number");
		}

	}

	public static void weekNmaesUsingSwitch(String a) {
		switch (a) {
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid weekday");
		}

	}

}
