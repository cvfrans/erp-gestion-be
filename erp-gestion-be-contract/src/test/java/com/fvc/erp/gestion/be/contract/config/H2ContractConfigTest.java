package com.fvc.erp.gestion.be.contract.config;

import javax.sql.DataSource;

import org.dbunit.ext.h2.H2DataTypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.github.springtestdbunit.bean.DatabaseConfigBean;
import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;

@Configuration
@Import(ContractConfig.class)
//@EnableWebMvc
//@Import(H2OrquestrationConfig.class)
//@ComponentScan(basePackages = { "com.isb.rda.conversor.contract.rel.restcontroller" })
public class H2ContractConfigTest {
	
	/*
	 	@Autowired
	@Qualifier("dataSourceConversorH2")
	DataSource datasource;
	
	@Bean
	public DatabaseConfigBean dbUnitDatabaseConfig() {
		final DatabaseConfigBean bean = new DatabaseConfigBean();
		bean.setDatatypeFactory(new H2DataTypeFactory());
		bean.setQualifiedTableNames(true);
		return bean;
	}

	@Bean
	public DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection() {
		final DatabaseDataSourceConnectionFactoryBean bean = new DatabaseDataSourceConnectionFactoryBean(datasource);
		bean.setDatabaseConfig(dbUnitDatabaseConfig());
		bean.setSchema("DESADM");
		return bean;
	}
	 */

}
