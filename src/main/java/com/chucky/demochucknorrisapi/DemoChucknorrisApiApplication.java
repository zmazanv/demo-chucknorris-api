package com.chucky.demochucknorrisapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoChucknorrisApiApplication {

	private final static Logger log = LoggerFactory.getLogger(DemoChucknorrisApiApplication.class);

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Joke joke = restTemplate.getForObject(
					"https://api.chucknorris.io/jokes/random", Joke.class);
			log.info(joke.toString());
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoChucknorrisApiApplication.class, args);
	}

}
