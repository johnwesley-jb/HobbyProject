package com.john.webshop.controller;


import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api/v1/customers")
public class CustomerController {

    @GetMapping
    public ResponseEntity<?> getCustomers(){
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
}
