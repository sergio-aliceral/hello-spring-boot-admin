package br.com.aliceraltecnologia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@Configuration
@EnableAdminServer
@EnableAutoConfiguration
@SpringBootConfiguration
public class HelloSpringBootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootAdminApplication.class, args);
	}

}
