package com.example.keesunspringboot;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// cors 의 오리진을 추가
@CrossOrigin(origins = "http://localhost:18080")
public class CorsController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
