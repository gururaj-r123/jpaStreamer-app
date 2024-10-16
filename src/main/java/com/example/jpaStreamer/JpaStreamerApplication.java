package com.example.jpaStreamer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.jpaStreamer", "com.speedment.jpastreamer"})
public class JpaStreamerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaStreamerApplication.class, args);
	}

}
