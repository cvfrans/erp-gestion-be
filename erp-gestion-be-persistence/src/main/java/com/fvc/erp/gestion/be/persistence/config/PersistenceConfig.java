package com.fvc.erp.gestion.be.persistence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Import(H2DbConfig.class)
@ComponentScan(
	basePackages = {
			"com.fvc.erp.gestion.be.persistence.ventas.repository"
	})
public class PersistenceConfig {

}
