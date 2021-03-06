/**
 *
 * @author raghavdutta
 * 
 * @tiApr. 16, 2020
 */
package com.learnswagger.demo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author raghavdutta
 *
 */

@Configuration
@EnableSwagger2WebMvc
@Import({SpringDataRestConfiguration.class})
public class ApplicationSwaggerConfig {
	
	
	@Bean
	public Docket employeeApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.learnswagger.demo"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	    		.title("Employee API")
	    		.version("1.0")
	    		.description("API for managing clients")
	    		.contact(new Contact("Raghav", "https://github.com/RaghavDutta/InterviewPrep", "raghav@example.com"))
	    		.license("Apache Licence Version 2.0")
	    		.build();
	}

}
