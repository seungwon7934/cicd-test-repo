package com.example.cicdtestrepo.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/v2")
    public String helloV2(){
        return "hello";
    }

    @GetMapping("/hello/v3")
    public String helloV3(){
        return "hello";
    }

    @GetMapping("/hello/v4")
    public String helloV4(){
        return "hello";
    }

    @GetMapping("/hello/v5")
    public String helloV5(){
        return "hello";
    }
}
