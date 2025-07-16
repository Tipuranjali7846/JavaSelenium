package Day10;

public class MainClass {

	public static void main(String[] args) {
		Employee emp1= new Employee();
		emp1.eid=101;
		emp1.ename="Anjali";
		emp1.job="Consultant";
		emp1.salary=55000;
		emp1.display();
		
		Employee emp2= new Employee();
		emp1.eid=102;
		emp1.ename="Tipuranjali";
		emp1.job="Sr.Consultant";
		emp1.salary=85000;
		emp1.display();
		
		Student s=new Student();
		s.sid=101;
		s.sname="Hari";
		s.grade="A";
		s.printStudentData();
		
		Animal ani=new Animal();
		ani.name="horse";
		ani.Color="greishBrown";
		ani.breed="dolmachine";
		ani.PrintAnimalDetails();

	}

}
