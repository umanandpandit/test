package junitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySampleEqualsTest() {
		String exceptedName = "Raj";
		assertEquals(exceptedName, Employee.getEmpNameWithHighestSalary());
	}
	@Test
	public void myObjectEqualsTest() {
		Employee exceptedEmpObj = new Employee(1,"Raj", 150000);
		assertEquals(exceptedEmpObj, Employee.getHighestPaidEmployee());
	}
}
