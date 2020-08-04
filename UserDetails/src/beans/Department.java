package beans;

public class Department {
	
	private Integer departmentId;
	private String departmenttName;
	private String location;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(Integer departmentId, String departmenttName, String location) {
		super();
		this.departmentId = departmentId;
		this.departmenttName = departmenttName;
		this.location = location;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmenttName() {
		return departmenttName;
	}

	public void setDepartmenttName(String departmenttName) {
		this.departmenttName = departmenttName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmenttName=" + departmenttName + ", location="
				+ location + "]";
	}
	
	

}
