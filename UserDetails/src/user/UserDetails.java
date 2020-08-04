package user;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import beans.Address;
import beans.Department;
import beans.Employee;
import data.Data;
import service.Validation;

public class UserDetails {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		
		HashSet<Address> address=null;
		Validation validation=new Validation();
		Data data=new Data();
		
		while (true) {
			
			System.out.println("Enter 1 for Add employee");
			System.out.println("Enter 2 for sort by EmployeeId");
			System.out.println("Enter 3 for sort by FirstName");
			System.out.println("Enter 4 for sort by LastName");
			System.out.println("Enter 5 for sort by Salary");
			System.out.println("Enter 6 for sort by Department");
			System.out.println("Enter 7 Exit");
		
			int choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				Employee employee=new Employee();
				System.out.println("Enter Employee Id");
				String employeeId=scanner.next();
				if(validation.employeeIdValidate(employeeId)) {
				employee.setEmployeeId(employeeId);
				}
				else {
					System.out.println("Enter valid employeeId");
					break;
				}
				System.out.println("Enter First Name");
				String firstName = scanner.next();
				if(validation.employeeNameValidate(firstName)) {
					employee.setFirstName(firstName);
				}else {
					System.out.println("Enter valid First Name");
					break;
				}
				System.out.println("Enter Last Name");
				String lastName = scanner.next();
				if(validation.employeeNameValidate(lastName)) {
					employee.setLastName(lastName);
				}else {
					System.out.println("Enter valid Last Name");
					break;
				}
				System.out.println("Enter employee salary");
					int salary=scanner.nextInt();
					if (validation.salaryValidate(salary)) {
						employee.setSalary(salary);
						
					}
					else {
						System.out.println("Enter salary between 20000 and 5Lakhs");
						break;
				}
				System.out.println("Enter the date of joining");
						String dateOfJoinning=scanner.next();
						if (validation.dateOfJoiningValidation(dateOfJoinning)) {
							employee.setDateOfJoining(dateOfJoinning);
							
						}
						else {
							System.out.println("dates are not allowed");
							break;
				}
						Department department=new Department();
						System.out.println("Enter Department Id");
						int deptartmentId = scanner.nextInt();
						department.setDepartmentId(deptartmentId);
						System.out.println("Enter Department Name");
						department.setDepartmenttName(scanner.next());
						System.out.println("Enter location");
						department.setLocation(scanner.next());
						
						employee.setDepartment(department);
						
						System.out.println("Enter the no of address");
						int n = scanner.nextInt();
						address = new HashSet<Address>(n);
						for(int i=0;i<n;i++) {
							Address add = new Address();
							System.out.println("Enter address Id");
							add.setAddressId(scanner.nextInt());
							System.out.println("Enter address line1");
							add.setAddressLine1(scanner.next());
							System.out.println("Enter city");
							add.setCity(scanner.next());
							System.out.println("Enter state");
							add.setState(scanner.next());
							address.add(add);
						}
						employee.setAddress(address);
						data.setEmployees(employee);
						
						break;
						
						
			case 2 : 
				System.out.println("Sort By EmployeeId");
				Comparator<Employee> sortById = new Comparator<Employee>() {
					
					@Override
					public int compare(Employee e1, Employee e2) {
						return e1.getEmployeeId().compareTo(e2.getEmployeeId());
					}
				};


				Collections.sort(data.getEmployees(),sortById);
				for(Employee emp : data.getEmployees())
					System.out.println(emp);
				break;
			
			
		case 3 :
			System.out.println("Sort By Employee First Name");
			Comparator<Employee> sortByName = new Comparator<Employee>() {
				
				@Override
				public int compare(Employee e1, Employee e2) {
					return e1.getFirstName().compareTo(e2.getFirstName());
				}
			};
			Collections.sort(data.getEmployees(),sortByName);
			for(Employee emp : data.getEmployees())
				System.out.println(emp);
			break;
			
		case 4 : 
			System.out.println("Sort By Employee Last Name");
			Comparator<Employee> sortByLastName = new Comparator<Employee>() {
			
				@Override
				public int compare(Employee o1, Employee o2) {
					return o1.getLastName().compareToIgnoreCase(o2.getLastName());
				}
			};
			Collections.sort(data.getEmployees(),sortByLastName);
			for(Employee emp : data.getEmployees())
				System.out.println(emp);
			break;
	
	case 5 : 
			System.out.println("Sort By Salary");
			Comparator<Employee> sortBySal = new Comparator<Employee>() {
				public int compare(Employee o1, Employee o2) {
					return o1.getSalary().compareTo(o2.getSalary());
				}
			};
			Collections.sort(data.getEmployees(), sortBySal);
			for(Employee emp : data.getEmployees())
				System.out.println(emp);
			break;
			
			
	case 6 : 
		System.out.println("Sort By Employee Department Id");
		Comparator<Employee>  sortByDep= new Comparator<Employee>() {
		
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getDepartment().getDepartmentId().compareTo(e2.getDepartment().getDepartmentId());
			}
		};
		Collections.sort(data.getEmployees(),sortByDep);
		for(Employee emp : data.getEmployees())
			System.out.println(emp);
		break;
	
		
	
}
}
}
}