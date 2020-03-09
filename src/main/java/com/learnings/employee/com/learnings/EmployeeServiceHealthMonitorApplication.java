package com.learnings.employee.com.learnings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeServiceHealthMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceHealthMonitorApplication.class, args);
	}

}
