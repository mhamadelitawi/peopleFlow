package com.mhamadelitawi.peopleFlow;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "peopleflow" , version = "1.0" , description = "Demo app for interview"))
public class PeopleFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleFlowApplication.class, args);
	}

}
