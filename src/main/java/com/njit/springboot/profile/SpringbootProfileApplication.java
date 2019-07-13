package com.njit.springboot.profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class SpringbootProfileApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProfileApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

	}
	@Bean
	public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
}
