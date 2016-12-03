package com.mozovw.ssm.mybatis.mysql.noannotation.service;

import java.util.List;

import com.mozovw.ssm.core.common.entity.EmpEntity;


public interface INoAnnotaionService {
	public List<EmpEntity> findAllEmp();
}
