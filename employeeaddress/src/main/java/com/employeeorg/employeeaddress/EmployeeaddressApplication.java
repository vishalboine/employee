package com.employeeorg.employeeaddress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;

@SpringBootApplication
@ComponentScan(basePackages = "com.employeeorg.employeeaddress")
public class EmployeeaddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeaddressApplication.class, args);
    }
}
