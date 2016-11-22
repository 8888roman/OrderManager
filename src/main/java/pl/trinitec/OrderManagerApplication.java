package pl.trinitec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(exclude={org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class})
public class OrderManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderManagerApplication.class, args);
	}
}
