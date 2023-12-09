package com.demo.myfirstproject;

import com.demo.myfirstproject.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner {

    private final ProductService productService;

    public MyFirstProjectApplication(ProductService productService) {
        this.productService = productService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyFirstProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
         productService.createDatabase();
    }
}
