package com.example.keesunspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KeesunSpringBootApplication {

    /**
     * cors origin :
     *                  http, https
     *                  hostname (naver.com, google.com)
     *                  port( 8080, 3000 )
     *                  이 세개가 origin 이다 origin 이 다르면 기본설정으로는 cors error가 발생한다.
     */
    public static void main(String[] args) {
        SpringApplication.run(KeesunSpringBootApplication.class, args);
    }

}
