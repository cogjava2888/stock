package com.emarket.stock;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
	}


	public OpenAPI customOpenAPI(){

		return new OpenAPI().info(new Info().title("Stock Management Service").description("" +
				"This microservice handles operations related to Stocks such as stocks addition ."+
				"Retrieve stock details by company code within the provided duration."));
	}

}
