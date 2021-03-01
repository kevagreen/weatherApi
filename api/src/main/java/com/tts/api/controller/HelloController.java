package com.tts.api.controller;


import com.tts.api.EngineRepository.EngineRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello")
    public String getHello(){
        return "Hello Friends";
    }

    @GetMapping("/hello")
    public String personalGreeting(@RequestParam String name){
        return "Hello " + name;
    }

}
