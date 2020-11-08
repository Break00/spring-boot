package com.jason.lee;

import com.jason.lee.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;


@SpringBootTest
class SpringbootExampleApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Autowired
	DataSource dataSource;


	@Test
	void contextLoads() {
//		System.out.println(ioc.containsBean("helloService"));
//		System.out.println(ioc.containsBean("HelloService"));
//		System.out.println(person.toString());
		System.out.println(dataSource.getClass().getName());
	}

}
