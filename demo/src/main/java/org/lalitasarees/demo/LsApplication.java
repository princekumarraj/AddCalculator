package org.lalitasarees.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LsApplication {

	public static void main(String[] args) {
		System.out.println(MyController.myMethod());
		SpringApplication.run(LsApplication.class, args);
	}

}
