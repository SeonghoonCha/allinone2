package com.fastcampus.javaallinon.project1.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Controller + @ResponseBody = @RestController
 */
@RestController
public class HelloworldController {

    @GetMapping("/api/helloWorld")
    public String welcome() {
        return "HELLO WORLD";
    }

}
