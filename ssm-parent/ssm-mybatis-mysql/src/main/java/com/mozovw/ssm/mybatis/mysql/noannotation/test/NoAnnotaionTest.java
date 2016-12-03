package com.mozovw.ssm.mybatis.mysql.noannotation.test;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mozovw.ssm.core.common.entity.EmpEntity;
import com.mozovw.ssm.mybatis.mysql.noannotation.dao.INoAnnotaionDao;
import com.mozovw.ssm.mybatis.mysql.noannotation.service.INoAnnotaionService;


public class NoAnnotaionTest {
	
	String cfg = "com/mozovw/ssm/mybatis/mysql/noannotation/config/spring-context.xml";
	ApplicationContext ctx = new ClassPathXmlApplicationContext(cfg);
	
	INoAnnotaionService noAnnotaionService 
		= ctx.getBean("noAnnotaionService", INoAnnotaionService.class);
	INoAnnotaionDao noAnnotaionDao
		= ctx.getBean("noAnnotaionDao", INoAnnotaionDao.class);
	
	@Before
	public void before(){
		System.out.println(123);
	}
	@Test
	public void test(){
		System.out.println(123);
	}
	
	@Test
	public void testFindAll() throws Exception {
		List<EmpEntity> emps =  noAnnotaionDao.findAllEmp();
		for (EmpEntity emp : emps) {
			System.out.println(emp);
		}
	}
	@Test
	public void testFindEmpByName() throws Exception {
		Map emp =  noAnnotaionDao.findEmpByName("ros");
		System.out.println(emp.get("name"));
	}
}
