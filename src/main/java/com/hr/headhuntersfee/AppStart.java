package com.hr.headhuntersfee;

import com.hr.headhuntersfee.entities.HeadHunter;
import com.hr.headhuntersfee.services.HeadHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.*"})
public class AppStart implements CommandLineRunner {

	@Autowired private HeadHunterService headHunterService;

	public static void main(String[] args) {

		SpringApplication.run(AppStart.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		seed();
	}

	// Seed here using services
	private  void seed() {
		HeadHunter h1 = new HeadHunter();
		h1.setFirstName("Damitha");
		h1.setLastName("Shyamantha");

		headHunterService.create(h1);
	}
}
