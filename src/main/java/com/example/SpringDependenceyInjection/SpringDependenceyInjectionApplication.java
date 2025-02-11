package com.example.SpringDependenceyInjection;

import com.example.SpringDependenceyInjection.controllers.MyController;
import com.example.SpringDependenceyInjection.controllers.ConstructorInjectedController;
import com.example.SpringDependenceyInjection.controllers.MyController;
import com.example.SpringDependenceyInjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependenceyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDependenceyInjectionApplication.class, args);

        MyController controller = ctx.getBean(MyController.class);

        System.out.println("In Main Method");

        System.out.println(controller.sayHello());
    }
}
