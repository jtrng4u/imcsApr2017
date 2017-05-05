package trng.imcs.service.bo;

import java.util.Date;

public class Employee {
	private Long empNo;
	private String name;
	private float salary;
	private Date joinDate;
	private Integer deptNo;
	
	
	
	public Employee(Long empNo, String name, float salary, Date joinDate, Integer deptNo) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
		this.joinDate = joinDate;
		this.deptNo = deptNo;
	}
	public Long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}

	
}
