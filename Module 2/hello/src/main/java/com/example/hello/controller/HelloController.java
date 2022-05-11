package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    //writing method that runs whenever anyone tries to run a GET to /
    String sayHello() {
        return "salutations";
    }

    @RequestMapping(value="/goodbye", method=RequestMethod.GET)
    String sayGoodbye() {
        return "adieu";
    }

    @RequestMapping(value="/goodbye", method=RequestMethod.DELETE)
    public void deleteGoodbye() {
        System.out.println("Deleting the goodbye!!! However that works...");

    }
}
