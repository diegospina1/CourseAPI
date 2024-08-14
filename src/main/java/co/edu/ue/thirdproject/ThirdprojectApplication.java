package co.edu.ue.thirdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.ue", "co.edu.ue.service", "co.edu.ue.controller", "co.edu.ue.model", "co.edu.ue.repository"})
public class ThirdprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdprojectApplication.class, args);
	}

}
