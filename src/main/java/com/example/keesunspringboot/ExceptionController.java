package com.example.keesunspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {

    @GetMapping("/hello")
    public String hello(){
        throw new CustomException();
    }

    @ExceptionHandler(ExceptionController.class)
    public @ResponseBody AppError sampleError(CustomException e){
        
    }
}
