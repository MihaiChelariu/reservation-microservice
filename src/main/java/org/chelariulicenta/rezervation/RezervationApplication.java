package org.chelariulicenta.rezervation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RezervationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RezervationApplication.class, args);
	}

}
