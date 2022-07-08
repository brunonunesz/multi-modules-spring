package org.bebrave.controller;

import org.bebrave.service.EvenOddService;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EvenOddApplication {
    @Resource
    private EvenOddService evenOddService;

    @GetMapping("/validate/{number}")
    public String isEvenOrOdd(
            @PathVariable("number") Integer number) {
        return evenOddService.isEvenOrOdd(number);
    }

    public static void main(String[] args) {
        SpringApplication.run(EvenOddApplication.class, args);
    }
}
