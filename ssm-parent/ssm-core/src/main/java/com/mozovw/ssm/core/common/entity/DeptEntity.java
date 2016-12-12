package com.mozovw.ssm.core.common.entity;

import java.util.List;

import com.mozovw.ssm.core.base.entity.BaseEntity;

public class DeptEntity extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6257430642393651369L;
	private String deptno;   //NUMBER
	private String dname;   //VARCHAR2
	private String loc;   //VARCHAR2
	
	private List<EmpEntity> emps;
	
	
	public List<EmpEntity> getEmps() {
		return emps;
	}
	public void setEmps(List<EmpEntity> emps) {
		this.emps = emps;
	}
	
	
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc
				+ "]";
	}
	
	
}
