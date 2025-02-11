package com.example.SpringDependenceyInjection.controllers;

import com.example.SpringDependenceyInjection.services.GreetingService;
import com.example.SpringDependenceyInjection.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}
