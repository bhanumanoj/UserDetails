package service;

import java.time.LocalDate;

public class Validation {
	public boolean employeeIdValidate(String employeeId) {

		String pattern="[0-9]{5}[_]{1}[a-zA-z]{2}";
		
		return employeeId.matches(pattern);
	}

	public boolean employeeNameValidate(String name) {
			
		String pattern="^[a-zA-Z]*$";
		
		return name.matches(pattern);
		
	}
	
	public boolean salaryValidate(long salary) {
		if((salary>=20000)&&(salary<=500000)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean dateOfJoiningValidation(String date) {
		
		LocalDate joinDate = LocalDate.parse(date);
		int flag = joinDate.compareTo(LocalDate.now());
		return (flag>=0);
	}
}
