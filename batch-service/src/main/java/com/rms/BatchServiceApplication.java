package com.rms;

import java.time.LocalDate;

import com.rms.dao.BatchDaoContract;
import com.rms.model.Batch;
import com.rms.model.Curriculum;
import com.rms.service.BatchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
// @EnableEurekaClient
public class BatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchServiceApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(BatchDaoContract bdc) {
	// 	LocalDate today = LocalDate.now();
	// 	LocalDate finish = today.plusMonths(3);
	// 	int[] associates = new int[21];
	// 	Curriculum c = Curriculum.JAVA_MSA;
	// 	return args -> {bdc.save(new Batch("Java Fullstack", today, finish, 1, 1, null, c));};
	// 	return args -> {bdc.save(new Batch("Java Fullstack", today, finish, 1, 1, null, c));};
	// 	return null;
	// }

}
