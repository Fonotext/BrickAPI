package com.fonotext.brickapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@ComponentScan(basePackages = "com.fonotext.brickapi")
public class BrickapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrickapiApplication.class, args);
	}

}
