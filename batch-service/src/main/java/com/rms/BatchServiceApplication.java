package com.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 1912dec16 Java Fullstack Batch
 * <br>
 * <br>
 * The BatchServiceApplication class runs the Tomcat server.
 */
@SpringBootApplication
@EnableEurekaClient
public class BatchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchServiceApplication.class, args);
	}

}
