package com.example.SpringDependenceyInjection;

import com.example.SpringDependenceyInjection.controllers.ConstructorInjectedController;
import com.example.SpringDependenceyInjection.controllers.MyController;
import com.example.SpringDependenceyInjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class SpringDependenceyInjectionApplication implements CommandLineRunner {

    @Autowired
    private MyController myController;

    @Autowired
    private ConstructorInjectedController constructorInjectedController;

    @Autowired
    private PropertyInjectedController propertyInjectedController;

    public static void main(String[] args) {
        SpringApplication.run(SpringDependenceyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println(constructorInjectedController.sayHello());
        System.out.println(myController.sayHello());
        System.out.println(propertyInjectedController.sayHello());
    }
}
