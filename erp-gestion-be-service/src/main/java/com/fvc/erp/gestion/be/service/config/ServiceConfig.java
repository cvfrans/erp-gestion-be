package com.fvc.erp.gestion.be.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.fvc.erp.gestion.be.persistence.config.PersistenceConfig;

@Configuration
@Import(PersistenceConfig.class)
@ComponentScan( basePackages = {
		"com.fvc.erp.gestion.be.service.ventas.service"
	})
public class ServiceConfig {

}
