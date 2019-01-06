package com.clearbases.lab3client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab3ClientApplication {

    @Value("${lucky-word}") String luckyWord;

    @GetMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }

	public static void main(String[] args) {
		SpringApplication.run(Lab3ClientApplication.class, args);
	}

}