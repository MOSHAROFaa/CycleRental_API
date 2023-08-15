package com.cycleRental.cycleRentalCRUD;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableJpaRepositories(basePackages = "com.cycleRental.cycleRentalCRUD.repository")

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.CycleRental.CycleRentalCrud")

public class CycleRentalCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CycleRentalCrudApplication.class, args);
	}

}
