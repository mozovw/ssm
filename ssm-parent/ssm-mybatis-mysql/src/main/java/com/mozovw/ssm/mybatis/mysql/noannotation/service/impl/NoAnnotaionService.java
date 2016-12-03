package com.mozovw.ssm.mybatis.mysql.noannotation.service.impl;

import java.util.List;

import com.mozovw.ssm.core.common.entity.EmpEntity;
import com.mozovw.ssm.mybatis.mysql.noannotation.dao.INoAnnotaionDao;
import com.mozovw.ssm.mybatis.mysql.noannotation.service.INoAnnotaionService;

public class NoAnnotaionService implements INoAnnotaionService {
	
	private INoAnnotaionDao noAnnotaionDao;
	
	
	
	@Override
	public List<EmpEntity> findAllEmp() {
		return getNoAnnotaionDao().findAllEmp();
	}



	public INoAnnotaionDao getNoAnnotaionDao() {
		return noAnnotaionDao;
	}



	public void setNoAnnotaionDao(INoAnnotaionDao noAnnotaionDao) {
		this.noAnnotaionDao = noAnnotaionDao;
	}

}
