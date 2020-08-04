package beans;

import java.time.LocalDate;
import java.util.Set;


public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private Integer salary;
	private String dateOfJoining;
	private Department department;
	private Set<Address> address;
	
	public Employee() {
		super();

	}

	public Employee(String employeeId, String firstName, String lastName, Integer salary, String dateOfJoining,
			Department department, Set<Address> address) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.department = department;
		this.address = address;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + ", dateOfJoining=" + dateOfJoining + ", department=" + department
				+ ", address=" + address + "]";
	}

	
	
	
	
}
