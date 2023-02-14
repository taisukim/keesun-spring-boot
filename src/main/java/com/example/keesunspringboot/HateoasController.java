package com.example.keesunspringboot;


import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController

public class HateoasController {

    @GetMapping("/hello")
    public EntityModel<Hello> hello(){
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("taesoo");


        // hateoas Resource 는 EntityModel 로 변경됨
        // 얘는 정확히 뭘하는지는 모르겠는데 포함하고싶은 링크정보들을 객체에 같이 넣을수 있게 해주는것같음..
        EntityModel<Hello> helloEntityModel = EntityModel.of(hello);
        helloEntityModel.add(linkTo(methodOn(HateoasController.class).hello()).withSelfRel());

        return helloEntityModel;
    }
}
