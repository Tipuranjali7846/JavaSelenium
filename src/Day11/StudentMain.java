package Day11;

public class StudentMain {

	public static void main(String[] args) {
		//Assign data using object reference variable
//		StudentData stu= new StudentData();
//		stu.sid=101;
//		stu.sname="Anjali";
//		stu.sgrade='A';
//	
//		Assign data with user defined method
//		stu.setStuDetails(102, "Tipura", 'B');
//		stu.printStuDetails();
//		using constructor
		StudentData stu1=new StudentData(103, "Tipuranjali", 'c');
		stu1.printStuDetails();
		
	}

}
