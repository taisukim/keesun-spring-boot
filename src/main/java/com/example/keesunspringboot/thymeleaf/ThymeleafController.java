package com.example.keesunspringboot.thymeleaf;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThymeleafController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("name", "taesoo");
        return "hello";
    }
}
