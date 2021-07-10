package com.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public TestController() {
        System.out.println("===> TestController 생성");
    }

}
