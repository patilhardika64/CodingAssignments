public class Employee{
	int Emp_Id;
	String Emp_Name;
	int Emp_Age;
	double Emp_Salary;
	String Joining_Date;
	
	Employee(int Emp_Id, String Emp_Name, int Emp_Age, double Emp_Salary,  String Joining_Date){
		this.Emp_Id = Emp_Id;
		this.Emp_Name = Emp_Name;
		this.Emp_Age = Emp_Age;
		this.Emp_Salary = Emp_Salary;
		this.Joining_Date = Joining_Date;
		
	}

	public void displayDetails(){
		System.out.println("Employee ID: " + Emp_Id);
		System.out.println("Employee Name: " + Emp_Name);
		System.out.println("Employee Age:" + Emp_Age);
		System.out.println("Employee Salary: " + Emp_Salary);
		System.out.println("Employee Joining Date: " + Joining_Date);
		
		
	}
	
	public static void main(String [] args){
		Employee emp = new Employee(101, "Hardika", 22, 25000, "02-6-2026");
		emp.displayDetails();
		
		
		
	}
}