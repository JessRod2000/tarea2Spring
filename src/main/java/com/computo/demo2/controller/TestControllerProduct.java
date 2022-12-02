package com.computo.demo2.controller;

import com.computo.demo2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestControllerProduct {

    private final ProductService productService;
    @Autowired
    public TestControllerProduct(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/hello")
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("<h1>Hola Mundo</h1>", HttpStatus.OK);
    }

    @GetMapping("/products")
    public ResponseEntity<?> findAllProducts(){
        return new ResponseEntity<>(productService.findAllProducts(), HttpStatus.OK);
    }
}