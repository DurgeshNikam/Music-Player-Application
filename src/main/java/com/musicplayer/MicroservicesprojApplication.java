package com.musicplayer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.musicplayer.Repositary")
public class MicroservicesprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesprojApplication.class, args);
	}

}
