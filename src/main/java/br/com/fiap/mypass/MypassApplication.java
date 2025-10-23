package br.com.fiap.mypass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class MypassApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypassApplication.class, args);
	}
}
