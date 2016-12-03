package com.mozovw.ssm.mybatis.mysql.noannotation.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.mozovw.ssm.core.common.entity.DeptEntity;
import com.mozovw.ssm.core.common.entity.EmpEntity;
import com.mozovw.ssm.mybatis.mysql.noannotation.dao.INoAnnotaionDao;





public class NoAnnotaionDao extends SqlSessionDaoSupport implements INoAnnotaionDao{
	public static String path = "com.mozovw.ssm.mybatis.mysql.noannotation.dao.impl.NoAnnotaionDao.";
	
	
	public List<EmpEntity> findAllEmp(){
		return getSqlSession().selectList(path+"findAllEmp");
	}
	public List<DeptEntity> findDeptsByName(String dname){
		return getSqlSession().selectList(path+"findDeptsByName",dname);
	}
	public EmpEntity findEmpOfDeptByName(String name){
		return getSqlSession().selectOne(path+"findEmpOfDeptByName",name);
	}
	
	public Map  findEmpByName(String name){
		return (Map)getSqlSession().selectOne(path+"findEmpByName",name);
	}
	
	public int addEmps(List<EmpEntity> emps){
		return getSqlSession().insert(path+"addEmps2",emps);
	}
	public int addEmp(EmpEntity emp){
		return getSqlSession().insert(path+"addEmp",emp);
	}
	
	public int updateEmps(List<EmpEntity> emps){
		return getSqlSession().update(path+"updateEmps",emps);
	}
	public int updateEmp(EmpEntity emp){
		return getSqlSession().update(path+"updateEmp",emp);
	}
	
	public int mergeEmp(EmpEntity emp){
		return getSqlSession().insert(path+"mergeEmp",emp);
	}
}
