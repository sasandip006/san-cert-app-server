package com.example.demo.cert.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping
    public String serverData() {
        log.warn("This is server logger from logger server");
        return "Data from server, Helo Sandeep";
    }
}