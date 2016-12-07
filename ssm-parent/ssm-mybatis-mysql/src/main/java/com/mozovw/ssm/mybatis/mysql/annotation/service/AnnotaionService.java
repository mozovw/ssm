package com.mozovw.ssm.mybatis.mysql.annotation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mozovw.ssm.core.common.entity.EmpEntity;
import com.mozovw.ssm.mybatis.mysql.annotation.dao.AnnotaionDao;

@Service
@Transactional(readOnly = true)
public class AnnotaionService  {
	
	@Autowired
	private AnnotaionDao annotaionDao;
	
	public List<EmpEntity> findAllEmp() {
		return annotaionDao.findAllEmp();
	}




}
