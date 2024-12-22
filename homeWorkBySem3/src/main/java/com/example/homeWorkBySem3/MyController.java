package com.example.homeWorkBySem3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MyController {
    @GetMapping("/hello")
    public Map<String, String> sayHello(@RequestParam (value = "name",defaultValue = "World")String name) {
        return Map.of("message", "Hello " + name + "!");
    }
}
