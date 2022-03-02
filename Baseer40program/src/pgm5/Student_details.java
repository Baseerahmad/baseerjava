package pgm5;

public class Student_details {
	int empId;
	String empName;
	String department;
	float salary;
	
	//default constructor
	public Student_details()
	{
		empId=1;
		empName="Emp0001";
		department="finance";
		salary=35000;
	}
	//parameterized constructor
	public Student_details(String empName,String department,float salary)
	{
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	//parameterized constructor
	public Student_details(int empId,String empName,String department,float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.department=department;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("Department "+department);
		System.out.println("Salary "+salary);
	}
	public static void main(String[] args) {
		Student_details e=new Student_details();
		Student_details e1= new Student_details(12, "Baseerahmad", "EEE", 450000);
		
		e.display();
		e1.display();
	}
}
