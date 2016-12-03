package com.mozovw.ssm.mybatis.mysql.noannotation.dao;

import java.util.List;
import java.util.Map;

import com.mozovw.ssm.core.common.entity.DeptEntity;
import com.mozovw.ssm.core.common.entity.EmpEntity;



public interface INoAnnotaionDao {
	public List<EmpEntity> findAllEmp();
	public List<DeptEntity> findDeptsByName(String dname);
	public EmpEntity findEmpOfDeptByName(String name);
	
	public Map  findEmpByName(String name);
	
	public int addEmps(List<EmpEntity> emps);
	public int addEmp(EmpEntity emp);
	
	public int updateEmps(List<EmpEntity> emps);
	public int updateEmp(EmpEntity emp);
	
	public int mergeEmp(EmpEntity emp);
}
