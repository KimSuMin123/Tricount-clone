package com.goorm.tricountapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@ServletComponentScan
@SpringBootApplication
public class TricountapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TricountapiApplication.class, args);
	}

}
