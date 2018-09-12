package nl.engie.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public String hello() {
        return "Hello world 2XXXXX  XXXX! " + System.getenv("SPRING_PROFILES_ACTIVE");
    }

}
