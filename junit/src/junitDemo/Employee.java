package junitDemo;

public class Employee {
	private int empID;
	private String name;
	private int salary;
	
	
	
	
	public Employee(){
		
	}

	public Employee(int empID, String name, int salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	
	public static String getEmpNameWithHighestSalary(){
		
		
		return "Raj";
	}
	
	public static Employee getHighestPaidEmployee(){
		
		
		return new Employee(1,"raj",150000);
	}

	@Override
	public int hashCode() {
		return this.empID;
	}

	@Override
	public boolean equals(Object obj) {
		
		Employee emp = (Employee) obj;
		
		boolean status = false ;
		if (this.name.equalsIgnoreCase(emp.name)
				&& this.empID == emp.empID
				&& this.salary==emp.salary)
			status =true;
			return true;
	}

	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
