package com.garrech;

import com.garrech.costumer.Customer;
import com.garrech.costumer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CostumerApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CostumerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerRepository.save(Customer.builder()
				.customerName("ahmed")
				.customerAge(30)
				.customerPassword("password")
				.build());

		customerRepository.save(Customer.builder()
				.customerName("walid")
				.customerAge(28)
				.customerPassword("password")
				.build());

		customerRepository.save(Customer.builder()
				.customerName("morad")
				.customerAge(52)
				.customerPassword("password")
				.build());
	}
}
