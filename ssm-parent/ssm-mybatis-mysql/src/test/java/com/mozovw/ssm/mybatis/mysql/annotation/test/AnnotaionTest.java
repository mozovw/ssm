package com.mozovw.ssm.mybatis.mysql.annotation.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.mozovw.ssm.core.common.entity.EmpEntity;
import com.mozovw.ssm.core.log.test.JUnit4ClassRunner;
import com.mozovw.ssm.mybatis.mysql.annotation.dao.AnnotaionDao;


@RunWith(JUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:com/mozovw/ssm/mybatis/mysql/ssm/configs/spring-annotaion.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
public class AnnotaionTest {
	
	@Autowired(required=true)
	AnnotaionDao annotaionDao ;
	
	@Test
	public void testFindAll() throws Exception {
		List<EmpEntity> emps =  annotaionDao.findAllEmp();
		for (EmpEntity emp : emps) {
			System.out.println(emp);
		}
	}
	@Test
	public void testFindEmpByName() throws Exception {
		Map emp =  annotaionDao.findEmpByName("ros");
		System.out.println(emp.get("name"));
	}
}
