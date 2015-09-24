package com.fvc.erp.gestion.be.contract.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	@Bean
	  public Docket swaggerSpringMvcPlugin() {
	    return new Docket(DocumentationType.SWAGGER_2)
//	            .groupName("business-api")
//	            .select()
//	               //Ignores controllers annotated with @CustomIgnore
//	              .apis(not(withClassAnnotation(CustomIgnore.class)) //Selection by RequestHandler
//	              .paths(paths()) // and by paths
//	              .build()
	            .apiInfo(apiInfo());
	            /*.securitySchemes(securitySchemes())
	            .securityContext(securityContext())*/
	  }
	
	
	 private ApiInfo apiInfo() {
	        ApiInfo apiInfo = new ApiInfo(
	                "ERP Gestión Services Documentation",
	                "ERP Gestión Rest Services Documentation",
	                "1.0",
	                "",
	                "",
	                "", 
	                ""
	        );
	        return apiInfo;
	    }

}
