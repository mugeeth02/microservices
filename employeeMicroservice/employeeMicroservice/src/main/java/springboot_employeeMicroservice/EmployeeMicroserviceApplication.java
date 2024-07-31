package springboot_employeeMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeMicroserviceApplication.class, args);
	}

}

//Demo Steps

//1) Create 3 spring boot microservices - employees, name, salary
//2) Add the starter project below to employees micro service
//		<dependency>
//		<groupId>org.springframework.cloud</groupId>
//			<artifactId>spring-cloud-starter-circuitbreaker-resilience4j</artifactId>
//		</dependency>
//3) Call name micro service from employees micro service using Circuit Breaker interface