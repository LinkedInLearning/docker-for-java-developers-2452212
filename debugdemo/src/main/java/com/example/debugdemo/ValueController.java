package com.example.debugdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {
    private String currentValue = "Startup";
    @GetMapping("/value")
    public String getCurrentValue() {
        System.out.println("The current value is " + currentValue);
        return currentValue;
    }
}
