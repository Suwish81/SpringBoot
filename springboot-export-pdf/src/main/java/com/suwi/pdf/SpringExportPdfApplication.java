package com.suwi.pdf;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.suwi.pdf.model.Employee;
import com.suwi.pdf.repository.EmployeeRepository;

@SpringBootApplication
public class SpringExportPdfApplication implements CommandLineRunner {

	@Autowired
	EmployeeRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringExportPdfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		if (repository.count() == 0) {
			// save a list of Employees
			repository.saveAll(Arrays.asList(new Employee("Adam", "John"), new Employee("Sibin", "muhammed"),
					new Employee("Arun", "Mohan"), new Employee("Scott", "Morrison"),
					new Employee("Hikaru", "Nakamura"), new Employee("Ishivaka", "Yusuke")));
		}

	}
}
