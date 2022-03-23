package day2;

public class Employee {

	private int EmployeeId;
	private String EmployeeName;
	private String Designation;
	
	public Employee(){
		
		EmployeeId=1;
		EmployeeName="Heera";
		Designation="Senior FSD";
		
	}
	

	public Employee(int EmployeeId,String EmployeeName,String Designation)
	{
		this.EmployeeId=EmployeeId;
		this.EmployeeName=EmployeeName;
		this.Designation=Designation;
	}
	
	void Display()
	{
		System.out.println("Employee Details:\n Id,Name and Designation is:"+EmployeeId+" "+EmployeeName+" "+Designation);
	}
}
