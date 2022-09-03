package org.tcs;

public class EmployeeDetails {
	//method creation
	// methodname ctrl+space,enter
	// method 1
	private void employeeName() {
		System.out.println("Employee name : roshu");
		
	}
	//method 2
	private void employeeId() {
		System.out.println("Employee id : 2990"); 
		
	}
	private void empDob() {
		System.out.println("Employee Dob : 27-04-1993");
	}
	private void empPhone() {
		System.out.println("Employee Phone Number : 9999333333");

	}
	private void empEmail() {
		System.out.println("Employee Email : ram.roshu@gmail.com");

	}
	private void empAddress() {
		System.out.println("Employee Address : 22/12 ,1st floor,thoraipakkam,chennai");

	}
	//main method creation
	public static void main(String[] args) {
		//object creation 
		//ClassName objectName = new ClassName();
		EmployeeDetails e = new EmployeeDetails();
		// method calling
		// objectName.methodName();
		e.employeeName();
		e.employeeId();
		e.empDob();
		e.empPhone();
		e.empEmail();
		e.empAddress();
	}
	

}
