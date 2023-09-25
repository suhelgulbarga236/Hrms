package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long eid;
	@NotBlank(message = "Please enter proper employee name")
	@Size(min = 5, message = "Name should be atleast 5 characters")
	@Size(max = 12, message = "Name should not be greater than 12 characters")
	private String empName;
	private String empDept;
	private String empAdd;
	private String empMob;
	@Email(message = "Please enter a valid email Id", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	@NotNull(message = "Please enter a valid email Id")
	private String empEmail;

	public Profile(Long eid, String empName, String empDept, String empAdd, String empMob, String empEmail) {
		super();
		this.eid = eid;
		this.empName = empName;
		this.empDept = empDept;
		this.empAdd = empAdd;
		this.empMob = empMob;
		this.empEmail = empEmail;
	}

	public Profile() {
		super();
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public String getEmpMob() {
		return empMob;
	}

	public void setEmpMob(String empMob) {
		this.empMob = empMob;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

}
