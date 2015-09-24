package com.fvc.erp.gestion.be.persistence.config;

import javax.sql.DataSource;

import org.dbunit.ext.h2.H2DataTypeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.fvc.erp.gestion.be.common.config.CommonConfig;
import com.github.springtestdbunit.bean.DatabaseConfigBean;
import com.github.springtestdbunit.bean.DatabaseDataSourceConnectionFactoryBean;


@Configuration
@Import({CommonConfig.class,PersistenceConfig.class})
public class H2ConfigTest {

	/*
	@Autowired
	@Qualifier("dataSourceConversorH2")
	DataSource dataSource;
	
	@Bean
	public DatabaseConfigBean dbUnitDatabaseConfig(){
		final DatabaseConfigBean bean = new DatabaseConfigBean();
		bean.setDatatypeFactory(new H2DataTypeFactory());
		bean.setQualifiedTableNames(true);
		return bean;
	}
	
	@Bean
	public DatabaseDataSourceConnectionFactoryBean dbUnitDatabaseConnection(){
		final DatabaseDataSourceConnectionFactoryBean bean = new DatabaseDataSourceConnectionFactoryBean(dataSource);
		bean.setDatabaseConfig(dbUnitDatabaseConfig());
		bean.setSchema("DESADM");
		return bean;
	}
	
	@Bean
	public UserContext userContext(){
	  UserContext userContext = new UserContext();
	  userContext.setProfile(Profile.H2);
	  return userContext;
	}
	*/
}
