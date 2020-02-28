package com.rms;

import java.time.LocalDate;

import com.rms.dao.BatchDao;
import com.rms.model.Batch;
import com.rms.model.Curriculum;
import com.rms.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @EnableEurekaClient
public class BatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchServiceApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(BatchDao bd) {
	// 	LocalDate today = LocalDate.now();
	// 	LocalDate finish = today.plusMonths(3);
	// 	Curriculum c = Curriculum.CSHARP;
	// 	return args -> {bd.save(new Batch("Java Fullstack", today, finish, 1, 1, 21, c));};
	// 	// return args -> {bd.save(new Batch("Erin's Batch", today, finish, 2, 3, 540, c));};
	// }

}
