package com.example.keesunspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeesunSpringBootApplication {

    /**
     * spring boot 가 자동설정을 지원하는 템플릿엔진은
     * groovy
     * FreeMarker
     * Thymeleaf
     * Mustache
     * 등이 있다
     *
     */
    public static void main(String[] args) {
        SpringApplication.run(KeesunSpringBootApplication.class, args);
    }

}
