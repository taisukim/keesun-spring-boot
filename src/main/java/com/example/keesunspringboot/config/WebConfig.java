package com.example.keesunspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     *  static 폴더안에있는 파일들 클라이언트에서 요청하는데
     *  선택적으로 설정할수 있음
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry
                // /m 으로 시작하는 요청이오면
                .addResourceHandler("/m/**")
                // /m 경로 안에있는 파일에서 끌어다 쓰겠다
                .addResourceLocations("classpath:/m/")
                // 요청시간 20초아래로 받겠다
                .setCachePeriod(20);
    }
}
