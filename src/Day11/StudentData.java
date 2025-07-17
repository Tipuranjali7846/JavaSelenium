package Day11;

public class StudentData {
	//Assign data using object reference variable
	int sid;
	String sname;
	char sgrade;
	
	void printStuDetails() {
		System.out.println(sid+" "+sname+" "+sgrade);
	}
	
	//Assign data with user defined method
	void setStuDetails(int id, String name, char grade) {
		sid=id;
		sname=name;
		sgrade=grade;		
	}
	
	//using constructor
	StudentData(int id, String name, char grade){
		sid=id;
		sname=name;
		sgrade=grade;
	}
	
	

}
