package com.coditas.StudentManagementAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StudentManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApiApplication.class, args);
	}

}
