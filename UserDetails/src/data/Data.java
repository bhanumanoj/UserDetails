package data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import beans.Employee;

public class Data {
	
	public List<Employee> employees = new ArrayList<Employee>();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(Employee employee) {
		
		 employees.add(employee);
		 System.out.println("New Employee data is registered");
	}
	

}
