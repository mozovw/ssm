package com.mozovw.ssm.core.common.entity;


public class EmpEntity {
	private String id; // NUMBER
	private String name; // VARCHAR2
	private String gender; // CHAR
	private String birth; // DATE
	private String hiredate; // DATE
	private String salary; // NUMBER
	private String comm; // NUMBER
	private String job; // VARCHAR2
	private String pid; // CHAR
	private String manager; // NUMBER
	private String deptno; // NUMBER
	private String rest; // CHAR
	
	private DeptEntity dept;

	public DeptEntity getDept() {
		return dept;
	}

	public void setDept(DeptEntity dept) {
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getRest() {
		return rest;
	}

	public void setRest(String rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", gender=" + gender
				+ ", birth=" + birth + ", hiredate=" + hiredate + ", salary="
				+ salary + ", comm=" + comm + ", job=" + job + ", pid=" + pid
				+ ", manager=" + manager + ", deptno=" + deptno + ", rest="
				+ rest + "]";
	}

}
