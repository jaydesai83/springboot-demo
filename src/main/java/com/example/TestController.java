package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String hello()
    {
        return "hello pete!";
    }
}
