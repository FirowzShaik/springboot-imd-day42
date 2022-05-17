package com.jobiak.imd;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;

@SpringBootApplication
public class SpringbootImdDay42Application {
	
	
	@Autowired
    CustomerRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootImdDay42Application.class, args);
	}
	
}
