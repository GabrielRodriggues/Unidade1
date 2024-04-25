package com.example.RestAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    // Exemplo de endpoint usando Spring Boot
    @GetMapping("/av1")
    public String helloWorld(){
        return "Essa é minha primeira API REST";
    }
}
