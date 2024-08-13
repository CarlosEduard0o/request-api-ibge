package com.playgroundibge.municipio_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {
// public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// RestTemplate restTemplate = new RestTemplate();
	// String url = "http://localhost:8080/api/municipios?estado=SP";
	// String response = restTemplate.getForObject(url, String.class);
	// System.out.println("Municípios: " + response);
	// }

    // @Override
    // public void run(String... args) throws Exception {
    //     RestTemplate restTemplate = new RestTemplate();
    //     String url = "http://localhost:8080/api/estados";
    //     String response = restTemplate.getForObject(url, String.class);
    //     System.out.println("Estados: " + response);
    // }
}
