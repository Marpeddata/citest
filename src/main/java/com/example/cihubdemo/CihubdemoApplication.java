package com.example.cihubdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CihubdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CihubdemoApplication.class, args);

	}


	@GetMapping("/")
	public String home() {
        return "Hello World";
    }

}
