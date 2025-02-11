package com.example.SpringDependenceyInjection;

import com.example.SpringDependenceyInjection.controllers.MyController;
import org.springframework.context.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDependenceyInjectionApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testGetControllerFromCtx(){
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
