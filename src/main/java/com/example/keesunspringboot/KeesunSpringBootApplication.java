package com.example.keesunspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeesunSpringBootApplication {

    /**
     * spring boot 가 지원하는 Inmemory database : h2
     * spring boot 의 자동설정으로 h2를 기본 database 로 사용하여 서버를 실행해준다
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(KeesunSpringBootApplication.class, args);
    }

}
