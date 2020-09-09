package com.di.diusingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiusingbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cofigAppContect=SpringApplication.run(DiusingbootApplication.class, args);
		Employee employee=cofigAppContect.getBean(Employee.class);
		System.out.println("Obeject returned employee: "+employee);
		System.out.println("Obeject returned department: "+employee.getDepartment());
	}

}
