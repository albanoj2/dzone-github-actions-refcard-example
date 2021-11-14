package com.dzone.albanoj2.refcard.github.actions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public HelloMessage sayHello() {
        return new HelloMessage("Hello, world!");
    }
}
