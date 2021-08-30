package com.example.demo.test;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	public Docket restApi() {

		return new Docket(DocumentationType.SWAGGER_2)
				.select()	
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.test"))

				.paths(PathSelectors.any())
				.build();
	}


}
