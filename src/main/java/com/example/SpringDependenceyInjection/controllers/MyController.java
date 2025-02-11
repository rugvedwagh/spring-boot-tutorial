package com.example.SpringDependenceyInjection.controllers;

import com.example.SpringDependenceyInjection.services.GreetingService;
import com.example.SpringDependenceyInjection.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(){
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello(){
        System.out.println("Im in a controller");

        return greetingService.sayGreeting();
    }
}
