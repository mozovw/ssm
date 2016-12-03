package com.mozovw.ssm.mybatis.mysql.annotation.dao;

import java.util.List;
import java.util.Map;


import com.mozovw.ssm.core.base.annotation.MybaitsDao;
import com.mozovw.ssm.core.common.entity.EmpEntity;


@MybaitsDao
public interface AnnotaionDao {
	public Map  findEmpByName(String name);
	public List<EmpEntity> findAllEmp();
	/*public List<DeptEntity> findDeptsByName(String dname);
	public EmpEntity findEmpOfDeptByName(String name);
	public int addEmps(List<EmpEntity> emps);
	public int addEmp(EmpEntity emp);
	public int updateEmps(List<EmpEntity> emps);
	public int updateEmp(EmpEntity emp);
	public int mergeEmp(EmpEntity emp);*/
}
