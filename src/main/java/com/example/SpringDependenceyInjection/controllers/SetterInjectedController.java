package com.example.SpringDependenceyInjection.controllers;

import com.example.SpringDependenceyInjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println("From the setterinjgected one");
        return greetingService.sayGreeting();
    }
}
