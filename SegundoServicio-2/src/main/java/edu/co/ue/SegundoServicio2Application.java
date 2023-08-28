package edu.co.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.uespring.second.controller"})
public class SegundoServicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(SegundoServicio2Application.class, args);
	}

}
